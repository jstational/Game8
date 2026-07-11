package game8.world.consumers;

import mindustry.world.consumers.*;

/** if boolean valid() returns true, then this block can produce */
/** onAdjacentUpdate() needs override to create Seq<Building> pressureSystem */
/** normal buildings cant have this property, sad :( */
public class ConsumePressure extends Consume {
    public float MinPressure;
    public float MaxPressure;

    public ConsumePressure() {
        this.MinPressure = 0f;
        this.MaxPressure = 0f;
    }

    @Override
    public boolean valid() {
        return true;
    }
}