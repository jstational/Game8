package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import mindustry.type.*;

public class MultiProducer extends Block {
    public PressureGeneratorBlock pressureGeneratorBlock = new PressureGeneratorBlock(0f, 0f);

    public MultiProducer(String name) {
        super(name);
    }
    public class MultiProducerBuild extends Building {}
}