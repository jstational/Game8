package game8.blocks;

import mindustry.world.Block;
import mindustry.gen.Building;

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
    }
}
