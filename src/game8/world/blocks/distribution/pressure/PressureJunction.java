package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureJunction extends Block {
    public PressureBlock pressureBlock = new PressureBlock();

    public PressureJunction(String name) {
        super(name);
    }
    public class PressureJunctionBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
    }
}