package game8.world.blocks.payload;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** welds payloads on a pad that can be brought into a PayloadDuctAcceptor or collected by a PayloadCrane */
public class PayloadWelderPad extends BaseBlock {
    public PayloadWelderPad(String name) {
        super(name);
    }

    public class PayloadWelderPadBuild extends BaseBuild {
        public int weldPercent;
        public Payload payload;
    }
}