package game8.world.generate.blocks.production;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;

public class PressureProducer extends Block {
    public PressureBlock PressureBlock = new PressureBlock();

    public PressureProducer(String name) {
        super(name);
    }
    public class PressureDrillBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();
    }
}