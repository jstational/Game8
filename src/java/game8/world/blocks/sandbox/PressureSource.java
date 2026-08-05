package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.Building;

public class PressureSource extends Block {
    public PressureSource(String name) {
        super(name);
    }
    
    public class PressureSourceBuild extends BaseBuild {
        private float minGenPressure, maxGenPressure;

        @Override
        public float getGenPressure() {
            return genMax ? this.maxGenPressure : this.minGenPressure;
        }
    }
}
