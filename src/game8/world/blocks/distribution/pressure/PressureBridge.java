package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

/** on obtain system, PressureBridge check link */
public class PressureBridge extends Block {
    public PressureBlock pressureBlock = new PressureBlock();

    public PressureBridge(String name) {
        super(name);
    }
    public class PressureBridgeBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
        /** find way to add Building value */
        public Building link = new Building();
    }
}