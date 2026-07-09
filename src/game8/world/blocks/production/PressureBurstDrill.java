package game8.world.blocks.production;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;

public class PressureBurstDrill extends Block {
    public PressureBlock pressureBlock = new PressureBlock();

    public PressureBurstDrill(String name) {
        super(name);
    }
    public class PressureBurstDrillBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
    }
}