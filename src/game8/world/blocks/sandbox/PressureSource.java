package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureSource extends Block {
    public PressureBlock PressureBlock = new PressureBlock();

    public PressureSource(String name) {
        super(name);
    }
    public class PressureSourceBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();
    }
}