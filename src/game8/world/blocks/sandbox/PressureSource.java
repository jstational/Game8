package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureSource extends Block {
    public PressureBlock PressureBlock = new PressureBlock(100000f, -100000f);

    public PressureSource(String name) {
        super(name);
    }
    
    public class PressureSourceBuild extends Building {
        public float genMax = 0f;
        public float genMin = 0f;

        public PressureBuild PressureBuild = new PressureBuild();
        public PressureGeneratorBuild PressureGeneratorBuild = new PressureGeneratorBuild();
    }
}
