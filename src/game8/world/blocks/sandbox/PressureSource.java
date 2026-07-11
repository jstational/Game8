package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureSource extends Block {
    public PressureBlock pressureBlock = new PressureBlock(10000f, -10000f);
    public PressureGeneratorBlock pressureGeneratorBlock = new pressureGeneratorBlock();

    public PressureSource(String name) {
        super(name);
    }
    
    public class PressureSourceBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
        public PressureGeneratorBuild pressureGeneratorBuild = new PressureGeneratorBuild();
    }
}