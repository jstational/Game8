package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

/** on obtain system, PressureJunction check in direction */
public class PressureJunction extends Block {
    public PressureJunction(String name) {
        super(name);
    }

    public class PressureJunctionBuild extends Building {}
}