package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

/** on obtain system, PressureJunction check in direction */
public class PressureJunction extends Block {
    public PressureBlock PressureBlock = new PressureBlock();

    public PressureJunction(String name) {
        super(name);
    }
    public class PressureJunctionBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();
    }
}