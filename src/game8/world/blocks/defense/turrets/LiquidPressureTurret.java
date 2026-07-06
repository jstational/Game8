package game8.world.blocks.defense.turrets;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;
import game8.world.blocks.defense.turrets.*;

public class LiquidPressureTurret extends BasePressureTurret {
    public PressureBlock PressureBlock = new PressureBlock();

    public PressureTurret(String name) {
        super(name);
    }
    public class LiquidPressureTurretBuild extends BasePressureTurretBuild {
        public PressureBuild PressureBuild = new PressureBuild();
    }
}