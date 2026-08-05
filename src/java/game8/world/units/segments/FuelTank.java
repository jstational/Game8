package game8.world.units.segments;

import arc.graphics.g2d.TextureRegion;

public class FuelTank implements Segment {
    private float maxFuel, x, y;
    private TextureRegion texture;

    public FuelTank() {
        this.x = 0f;
        this.y = 0f;
        this.maxFuel = 0f;
    }

    public FuelTank(float m, float x, float y) {
        this.maxFuel = m;
        this.x = x;
        this.y = y;
    }

    /** FuelTank at the center of the unit */
    public FuelTank(float m) {
        this(m, 0f, 0f)
    }
}