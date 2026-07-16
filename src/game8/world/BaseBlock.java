package game8.world;

import mindustry.world.Block;
import arc.struct.*;
import mindustry.gen.Building;

/** base block for game8 */
public class BaseBlock extends Block {
    public float minPressure, maxPressure, volume, minGenPressure, maxGenPressure, minConsumePressure, maxConsumePressure, genInterval, consumeInterval = 0f;
    public boolean hasPressure, producePressure, connectPressureSystems, consumePressure, startConsumeMin, startProduceMin = false;

    public BaseBlock(String name) {
        super(name);
        buildType = BaseBuild::new;
    }

    public class BaseBuild extends Building {
        /** oh my what the but ty PowerGenerator */
        public BaseBlock block;
        public boolean consumingMax, genMax, syncedToSystem;
        public Seq<Building> pressureSystem;

        public Seq<Building> getSystem() {
            Building curt;
            Seq<Building> processed;
            Seq<Building> willt;
            IntSet processedpos;

            return null;
        }

        public float getConsumePressure() {
            return consumingMax ? block.maxConsumePressure : block.minConsumePressure;
        }

        public float getGenPressure() {
           return genMax ? block.maxGenPressure : block.minGenPressure;
        }

        public float getMaxPressure() {
            return block.maxPressure;
        }

        public float getMinPressure() {
            return block.minPressure;
        }

        public float getVolume() {
            return block.volume;
        }

        public boolean hasPressure() {
            return block.hasPressure;
        }

        public boolean producePressure() {
            return block.producePressure;
        }

        public float getGenInterval() {
            return block.genInterval;
        }

        public float getConsumeInterval() {
            return block.consumeInterval;
        }
 
        public void setSystem() {}

        public void redefSystem() {}
    }
}