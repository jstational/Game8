package game8.world.blocks.logic;

import mindustry.world.Block;
import mindustry.gen.Building;

public class UnitRadar extends Block {
    public float range = 20f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends Building {}
}