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
    }

    public class BaseBuild extends Building {
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
            return consumingMax ? this.block.maxConsumePressure : this.block.minConsumePressure;
        }

        public float getGenPressure() {
           return genMax ? this.block.maxGenPressure : this.block.minGenPressure;
        }

        public float getMaxPressure() {
            return this.block.maxPressure;
        }

        public float getMinPressure() {
            return this.block.minPressure;
        }

        public float getVolume() {
            return this.block.volume;
        }

        public boolean hasPressure() {
            return this.block.hasPressure;
        }

        public boolean producePressure() {
            return this.block.producePressure;
        }

        public float getGenInterval() {
            return this.block.genInterval;
        }

        public float getConsumeInterval() {
            return this.block.consumeInterval;
        }
 
        public void setSystem() {}

        public void redefSystem() {}
    }
}