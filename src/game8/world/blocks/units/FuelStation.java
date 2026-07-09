package game8.world.blocks.units;

import mindustry.gen.Building;
import mindustry.world.Block;

public class FuelStation extends Block {
    public float range = 0f;

    public FuelStation(String name) {
        super(name);
    }
    public class FuelStationBuild extends Building {}
}