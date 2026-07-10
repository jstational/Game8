package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import game8.world.blocks.production.crafters.*;

public class ManualMultiCrafter extends MultiProducer {
    public ManualMultiCrafter(String name) {
        super(name);
    }
    public class ManualMultiCrafterBuild extends MultiProducerBuild {}
}