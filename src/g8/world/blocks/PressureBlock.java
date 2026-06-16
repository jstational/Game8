package game8.blocks;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.Util

public class PressureBlock extends Block {
    public PressureBlock (String name) {
        super(name);
        update = true;
    }
    public static class presssys {
        public boolean willACT = false; // use X (lowest value) first
    }
    public float volume;
    public float maxpress;
    public class PressureBuilding extends Building {
        public float pressure;
        @Override
        public void updateTile() {
            super.updateTile();
            float back = (float) contentField(this, "maxpress")
            if(this.pressure > back) {
                this.kill();
            }
        }
    }
}
