package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import game8.entities.*;
import mindustry.world.blocks.heat.*;

/** Uses heat from the block behind it */
public class EnvironmentHeater extends BaseBlock {
    public HeatedAreaCompanion heatStats = new HeatedAreaCompanion();

    public EnvironmentHeater(String name) {
        super(name);
    }
    
    public class EnvironmentHeaterBuild extends BaseBuild {
        public HeatedArea heatedArea;
    }
}