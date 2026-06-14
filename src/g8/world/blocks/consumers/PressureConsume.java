package game8.world.consumers;

import mindustry.world.consumers.*;
import arc.math.geom.Vec2;
import mindustry.gen.Building;
import arc.scene.ui.layout.Table;
import game8.world.blocks.PressureCrafter;
import game8.block.*;
import game8.world.blocks.PressureBlock;

public class PressureConsume extends Consume {
    public Vec2 pressreq;
    public boolean recAT;
    public void output(float amt) {
    }
    @Override
    public void display(Building build, Table table) {
    }
    @Override
    public boolean valid(Building build) {
        if (build.block instanceof PressureBlock block) {
            if (build instanceof PressureBlock.PressureBuilding bld) {
                if (block.recAT == true) {
                    if (bld.presssys.willACT == true) {
                        if (bld.pressure >= block.pressreq.y) {
                            bld.presssys.willACT = false;
                            return true;
                        }
                    } else {
                        if (bld.pressure >= block.pressreq.x) {
                            bld.presssys.willACT = true;
                        }
                    }
                } else {
                    if (bld.presssys.willACT == false) {
                        if (bld.pressure <= block.pressreq.x) {
                            bld.presssys.willACT = true;
                        }
                    } else {
                        if (bld.pressure >= block.pressreq.y) {
                            bld.presssys.willACT = false;
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}