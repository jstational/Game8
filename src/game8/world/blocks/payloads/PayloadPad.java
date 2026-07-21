package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** an output for PayloadDucts */
public class PayloadPad extends BaseBlock {
    public PayloadPad(String name) {
        super(name);
    }

    public class PayloadPadBuild extends BaseBuild {
        public Payload payload;
    }
}