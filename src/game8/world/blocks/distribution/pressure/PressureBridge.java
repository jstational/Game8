package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

/** on obtain system, PressureBridge check link */
public class PressureBridge extends BaseBlock {
    

    public PressureBridge(String name) {
        super(name);
    }

    public class PressureBridgeBuild extends BaseBuild {
        public Building link;
    }
}
