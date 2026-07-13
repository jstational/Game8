package game8.world.blocks.logic;

import game8.world.*;
import mindustry.gen.Building;

/** detects units */
public class UnitRadar extends Block {
    public float range = 0f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends Building {
        public boolean dectectsAllies = false;
    }
}