package game8.world.blocks.logic;

import mindustry.world.Block;
import mindustry.gen.Building;
import mindustry.logic.*;

public class UnitRadar extends Block {
    public float Range = 20f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends Building {}
}