package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import game8.world.blocks.production.crafters.*;

/** stores multiple items and can craft them when accessed by the player(s) */
public class ManualMultiCrafter extends MultiProducer {
    public ManualMultiCrafter(String name) {
        super(name);
    }
    
    public class ManualMultiCrafterBuild extends MultiProducerBuild {}
}