package game8.world.generate.blocks.production;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;

public class PressureDrill extends Block {
    public PressureBlock pressureBlock = new PressureBlock();

    public PressureDrill(String name) {
        super(name);
    }
    public class PressureDrillBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
    }
}