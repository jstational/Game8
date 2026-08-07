package game8.world.blocks.distribution.pressure;

import mindustry.world.*;
import mindustry.gen.Building;

/** on obtain system, PressureBridge check link */
public class PressureBridge extends Block implements PressureConnector {
    public PressureBridge(String name) {
        super(name);
    }

    public class PressureBridgeBuild extends Building {
        public Building link;
    }
}
