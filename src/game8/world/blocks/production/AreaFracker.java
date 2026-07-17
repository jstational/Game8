package game8.world.blocks.production;

import game8.world.*;
import game8.entities.*;
import mindustry.gen.Building;

public class AreaFracker extends BaseBlock {
    public float frackRate = 0f;

    public AreaFracker(String name) {
        super(name);
    }

    public class AreaFrackerBuild extends BaseBuild {
        public FrackedArea frackedArea;
    }
}