package game8.world;

import mindustry.world.Block;
import arc.struct.Seq;
import mindustry.gen.Building;

/** base block for game8 */
public class BaseBlock extends Block {
    public float minPressure, maxPressure, volume, minGenPressure, maxGenPressure, minConsumePressure, maxConsumePressure = 0f;
    public boolean hasPressure, producePressure, connectPressureSystems, consumePressure, startConsumeMin, startProduceMin = false;

    public BaseBlock(String name) {
        super(name);
    }

    public class BaseBuild extends Building {
        public boolean consumingMax, genMax, syncedToSystem;
        public Seq<Building> pressureSystem;
    }
}