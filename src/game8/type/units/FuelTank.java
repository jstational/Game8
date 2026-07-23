package game8.type.units;

import arc.math.geom.*;

public class FuelTank {
    public Vec2 position;
    public float maxFuel;

    public FuelTank() {
        this.position = new Vec2(0f,0f);
        this.maxFuel = 0f;
    }
}