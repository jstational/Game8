package game8.world.blocks.defense.turrets;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;
import game8.world.blocks.defense.turrets.*;

public class LiquidRadarTurret extends BaseRadarTurret {
    public LiquidRadarTurret(String name) {
        super(name);
    }
    public class LiquidRadarTurretBuild extends BaseRadarTurretBuild {
        @Override
        public void shoot(float x, float y) {}
    }
}