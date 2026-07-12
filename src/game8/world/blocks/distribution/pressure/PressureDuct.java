package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.world.blocks.*;

public class PressureDuct extends Block {
    public PressureBlock PressureBlock = new PressureBlock();

    public PressureDuct(String name) {
        super(name);
    }
    public class PressureDuctBuild extends Building {
        public PressureBuild PressureBuild = new PressureBuild();
    }
}