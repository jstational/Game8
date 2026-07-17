package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import game8.world.*;
import game8.type.*;

public class MultiProducer extends BaseBlock {
    public ItemOuts itemOuts = new ItemOuts();
    public LiquidOuts liquidOuts = new LiquidOuts();
    public PayloadOuts payloadOuts = new PayloadOuts();
    public float itemProductionRate = 0f;
    public float liquidProductionRate = 0f;
    public float payloadProductionRate = 0f;

    public MultiProducer(String name) {
        super(name);
    }
    
    public class MultiProducerBuild extends BaseBuild {}
}