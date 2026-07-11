package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.entities.*;
import mindustry.world.blocks.heat.*;

/** Uses heat from the block behind it */
public class EnvironmentHeater extends Block {
    /** sourceBlock<Block>, intoBlock<Block>, level<int> */

    public EnvironmentHeater(String name) {
        super(name);
    }
    public class EnvironmentHeaterBuild extends Building {
        public HeatedArea heatedArea;
    }
}