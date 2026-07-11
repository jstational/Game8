package game8.world.blocks.production;

import mindustry.world.*;
import mindustry.gen.Building;
import game8.entities.*;

public class AreaFracker extends Block {
    public AreaFracker(String name) {
        super(name);
    }

    public class AreaFrackerBuild extends Building {
        public FrackedArea frackedArea;
    }
}