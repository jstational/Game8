package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.Building;

/** on obtain system, PressureJunction check in direction */
public class PressureJunction extends Block implements PressureConnector {
    public PressureJunction(String name) {
        super(name);
    }

    public class PressureJunctionBuild extends BaseBuild {}
}