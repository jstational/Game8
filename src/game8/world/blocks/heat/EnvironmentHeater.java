package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.entities.*;

public class EnvironmentHeater extends Block {
    public EnvironmentHeater(String name) {
        super(name);
    }
    public class EnvironmentHeaterBuild extends Building {
        public HeatedArea heatedArea;
    }
}