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
        if ((Boolean) Util.contentField(build, "consumePressure") == true) {
            if ((int) (Util.contentField(build, "ActAT")) == 0) {
                if (build.WillACT == true) {
                    if (build.systemPressure() >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.WillACT = false;
                        return true;
                    }
                } else {
                    if (build.systemPressure() >= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.WillACT = true;
                    }
                }
            } else {
                if (build.WillACT == false) {
                    if (build.systemPressure() <= ((Press2) Util.contentField(build, "pressreq")).least) {
                        build.WillACT = true;
                    }
                } else {
                    if (build.systemPressure() >= ((Press2) Util.contentField(build, "pressreq")).greatest) {
                        build.WillACT = false;
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