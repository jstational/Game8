package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import mindustry.type.*;

public class MultiProducer extends Block {
    public MultiProducer(String name) {
        super(name);
    }
    public class MultiProducerBuild extends Building {
        public void Invoke() {}
    }
}