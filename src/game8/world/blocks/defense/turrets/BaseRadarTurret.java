package game8.world.blocks.defense.turrets;

import game8.world.*;
import mindustry.gen.Building;

public class BaseRadarTurret extends BaseBlock {
    public BaseRadarTurret(String name) {
        super(name);
    }

    public class BaseRadarTurretBuild extends BaseBuild {
        public void shoot(float x, float y) {}
    }
}