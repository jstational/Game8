package game8.world.consumers;

import mindustry.world.consumers.*;
import game8.utils.Press2;
import mindustry.gen.Building;
import arc.scene.ui.layout.Table;
import game8.world.blocks.PressureCrafter;
import game8.blocks.*;
import game8.world.blocks.PressureBlock;
import game8.utils.Util;

public class PressureConsume extends Consume {
    public Press2 pressreq;
    public boolean recAT;
    public boolean consumeThis;
    @Override
    public void display(Building build, Table table) {
    }
    @Override
    public boolean valid(Building build) {
        if ((boolean) Util.contentField(build, "consumeThis") == true) {
            if (((boolean) Util.contentField(build, "recAT")) == true) {
                if (build.PressureInternal.willACT == true) {
                    if (build.pressure >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.PressureInternal.willACT = false;
                        return true;
                    }
                } else {
                    if (build.pressure >= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.PressureInternal.willACT = true;
                    }
                }
            } else {
                if (build.PressureInternal.willACT == false) {
                    if (build.pressure <= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.PressureInternal.willACT = true;
                    }
                } else {
                    if (build.pressure >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.PressureInternal.willACT = false;
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }
}