package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** welds payloads on the ground */
public class PayloadWelder extends BaseBlock {
    public PayloadWelder(String name) {
        super(name);
    }
    
    public class PayloadWelderBuild extends BaseBuild {
        public int weldPercent;
        public Payload payload;
    }
}