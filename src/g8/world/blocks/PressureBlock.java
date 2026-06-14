package game8.blocks;

import mindustry.world.Block;
import mindustry.gen.Building;

public class PressureBlock extends Block {
    public PressureBlock (String name) {
        super(name);
        update = true;
    }
    public static class presssys {
        public int sec = 0; // use X (lowest value) first
    }
    public float pressure;
}
