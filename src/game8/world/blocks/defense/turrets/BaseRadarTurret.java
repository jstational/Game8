package game8.world.blocks.defense.turrets;

import game8.world.*;
import mindustry.gen.Building;
import game8.type.*;

public class BaseRadarTurret extends BaseBlock {
    public TurretSegment turret = new TurretSegment();

    public BaseRadarTurret(String name) {
        super(name);
    }

    public class BaseRadarTurretBuild extends BaseBuild {
        public void shoot(float x, float y) {}
    }
}