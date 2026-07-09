package game8.world.blocks.defense.turrets;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class BasePressureTurret extends Block {
    public PressureBlock pressureBlock = new PressureBlock();

    public BasePressureTurret(String name) {
        super(name);
    }
    public class BasePressureTurretBuild extends Building {
        public PressureBuild pressureBuild = new PressureBuild();
    }
}