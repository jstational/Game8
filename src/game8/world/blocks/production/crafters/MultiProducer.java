package game8.world.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import mindustry.type.*;

public class MultiProducer extends Block {
    public PressureBlock PressureBlock = new PressureBlock();
    public ItemSeq ProducedItems = new ItemSeq();
    public LiquidSeq ProducedLiquids = new LiquidSeq();
    public PayloadSeq ProducedPayloads = new PayloadSeq();

    public MultiProducer(String name) {
        super(name);
    }
    public class MultiProducerBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();

        public void Invoke() {}
    }
}