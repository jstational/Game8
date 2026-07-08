package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import mindustry.type.*;

public class MultiProducer extends Block {
    public PressureBlock PressureBlock = new PressureBlock();
    public ItemSeq ProducedItems;
    public LiquidStack ProducedLiquid;
    public PayloadSeq ProducedPayloads;

    public MultiProducer(String name) {
        super(name);
    }
    public class MultiProducerBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();

        public void Invoke() {}
    }
}