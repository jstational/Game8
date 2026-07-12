package game8.world.blocks.defense.turrets;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class BaseRadarTurret extends Block {
    public BaseRadarTurret(String name) {
        super(name);
    }
    public class BaseRadarTurretBuild extends Building {
        public void shoot(float x, float y) {}
    }
}