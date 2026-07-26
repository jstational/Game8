package game8.world;

import mindustry.world.Block;
import arc.struct.*;
import mindustry.gen.Building;

/** base block for game8 */
public class BaseBlock extends Block {
    public float minPressure, maxPressure, volume, minGeneratePressure, maxGeneratePressure, minConsumePressure, maxConsumePressure, geneerateInterval, consumeInterval = 0f;
    public boolean hasPressure, producePressure, connectPressureSystems, consumePressure, startConsumeMin, startProduceMin = false;

    public BaseBlock(String name) {
        super(name);
        buildType = BaseBuild::new;
    }

    public class BaseBuild extends Building {
        public BaseBlock block;
        public boolean consumingMax, generatingMax, syncedToSystem;
        public Seq<Building> pressureSystem;

        public Seq<Building> updatePressureSystem() {
            Building currentTarget;
            Seq<Building> processed;
            Seq<Building> willTrack;
            IntSet processedPositions;

            if(this.block.hasPressure) {
                return null;
            }

            willTrack.putAll(this.adjacent);
            processedPositions.put()
            

            while(!willTrack.isEmpty()) {
                if
            }

            return processed;
        }

        public float getConsumePressure() {
            return consumingMax ? block.maxConsumePressure : block.minConsumePressure;
        }

        public float getGenPressure() {
            return generatingMax ? block.maxGeneratePressure : block.minGeneratePressure;
        }
    }
}