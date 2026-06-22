package game8.world.consumers;

import mindustry.world.consumers.*;
import game8.utils.Press2;
import mindustry.gen.Building;
import game8.world.blocks.*;
import game8.utils.Util;
import game8.utils.Press2;

public class PressureConsume extends Consume {
    public Press2 pressreq = new Press2(0,0);
    public int actAT = 1;
    public boolean consumePressure;
    @Override
    public boolean valid(Building build) {
        if ((boolean) Util.contentField(build, "consumePressure") == true) {
            if ((int) (Util.contentField(build, "actAT")) == 0) {
                if (build.willACT == true) {
                    if (PLACEHOLDER_PRESSURESYSTEM >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.willACT = false;
                        return true;
                    }
                } else {
                    if (PLACEHOLDER_PRESSURESYSTEM >= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.willACT = true;
                    }
                }
            } else {
                if (build.willACT == false) {
                    if (PLACEHOLDER_PRESSURESYSTEM <= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.willACT = true;
                    }
                } else {
                    if (PLACEHOLDER_PRESSURESYSTEM >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.willACT = false;
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