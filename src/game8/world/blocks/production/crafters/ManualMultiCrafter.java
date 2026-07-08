package game8.world.generate.blocks.production.crafters;

import mindustry.gen.Building;
import mindustry.world.Block;
import game8.world.blocks.*;
import game8.world.blocks.production.crafters.*;

public class ManualMultiCrafter extends MultiProducer {
    public ManualMultiCrafter(String name) {
        super(name);
    }
    public class MultiProducerBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();

        @Override
        public void Invoke() {
            super.Invoke();
        }
    }
}