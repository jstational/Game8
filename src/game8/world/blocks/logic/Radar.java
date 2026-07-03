package game8.world.blocks.logic;

import mindustry.world.Block;
import mindustry.gen.Building;
import mindustry.logic.*;

public class Radar extends Block {
    public float Range = 20f;

    public Radar(String name) {
        super(name);
    }

    public class RadarBuild extends Building {}
}