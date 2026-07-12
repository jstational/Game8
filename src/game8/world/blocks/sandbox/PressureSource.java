package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureSource extends Block {
    public PressureBlock PressureBlock = new PressureBlock(10000f, -10000f);
    public PressureGeneratorBlock PressureGeneratorBlock = new PressureGeneratorBlock();

    public PressureSource(String name) {
        super(name);
    }
    
    public class PressureSourceBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();
        public PressureGeneratorBuild PressureGeneratorBuild = new PressureGeneratorBuild();
    }
}
