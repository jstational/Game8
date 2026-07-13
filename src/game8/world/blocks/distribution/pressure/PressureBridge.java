package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

/** on obtain system, PressureBridge check link */
public class PressureBridge extends Block {
    public PressureBridge(String name) {
        super(name);
    }

    public class PressureBridgeBuild extends Building {
        public Building link;
    }
}
