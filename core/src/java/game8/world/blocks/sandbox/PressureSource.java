package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.Building;

public class PressureSource extends Block {
    public PressureSource(String name) {
        super(name);
    }
    
    public class PressureSourceBuild extends Building {
        private float minOutputPressure, maxOutputPressure;
        private boolean outMax;

        @Override
        public float getGenPressure() {
            return outMax ? this.maxOutputPressure : this.minOutputPressure;
        }
    }
}
