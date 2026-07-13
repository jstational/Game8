package game8.world.blocks.logic;

import game8.world.*;
import mindustry.gen.Building;

/** detects units */
public class UnitRadar extends BaseBlock {
    public float range = 0f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends BaseBuild {
        public boolean dectectsAllies = false;
    }
}