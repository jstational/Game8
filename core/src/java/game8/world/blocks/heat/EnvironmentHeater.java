package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.Building;
import game8.entities.*;
import mindustry.world.blocks.heat.*;

/** Uses heat from the block behind it */
public class EnvironmentHeater extends Block {
    public HeatedAreaCompanion heatStats = new HeatedAreaCompanion();

    public EnvironmentHeater(String name) {
        super(name);
    }
    
    public class EnvironmentHeaterBuild extends Building {
        public HeatedArea heatedArea;
    }
}