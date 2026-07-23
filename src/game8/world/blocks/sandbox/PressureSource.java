package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

public class PressureSource extends BaseBlock {
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
