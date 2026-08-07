package game8.world.blocks.distribution.pressure;

import mindustry.world.*;
import mindustry.gen.Building;

public class PressureDuct extends Block implements PressureConnector {
    public PressureDuct(String name) {
        super(name);
    }

    public class PressureDuctBuild extends Building {}
}