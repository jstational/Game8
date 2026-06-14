package game8.world.consumers;

import mindustry.world.consumers.*;
import arc.math.geom.Vec2;
import mindustry.gen.Building;
import arc.scene.ui.layout.Table;
import game8.world.blocks.PressureCrafter;

public class PressureConsume extends Consume {
    public Vec2 pressreq;
    public void output(float amt) {
    }
    @Override
    public void display(Building build, Table table) {
    }
    @Override
    public boolean valid(Building build) {
        if (build instanceof PressureBlock) {
           if (build.presssys.sec = 1) {
            if (build.pressure => build.block.pressreq.y) {
                build.pressys.sec = 0;
            }
           } else {
            if (build.pressure <= build.block.pressreq.x) {
                build.presssys.sec = 1;
            }
           }
        }
        return false;
    }
}