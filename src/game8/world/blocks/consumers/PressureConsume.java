package game8.world.consumers;

import mindustry.world.consumers.*;
import game8.utils.Press2;
import mindustry.gen.Building;
import game8.world.blocks.PressureCrafter;
import game8.blocks.*;
import game8.utils.Util;
import game8.utils.Press2;

public class PressureConsume extends Consume {
    public Press2 pressreq = new Press2(0,0);
    public int actAT = 1;
    public boolean consumePressure;
    @Override
    public void display(Building build, Table table) {
    }
    @Override
    public boolean valid(Building build) {
        if ((boolean) Util.contentField(build, "consumePressure") == true) {
            if (((boolean) Util.contentField(build, "actAT")) == 0) {
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