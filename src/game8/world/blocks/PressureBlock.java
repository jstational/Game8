package  game8.world.blocks;

public class PressureBlock {
    /** If this amount of pressure is reached, this.kill(). */
    public float maxPressure;
    public float minPressure;
    public float volume;

    public boolean hasMMPressure;

    public PressureBlock() {}

    public PressureBlock(float min, float max, float vol) {
        this.minPressure = min;
        this.maxPressure = max;
        this.volume = vol;
    }

    public PressureBlock(float min, float max) {
        this(min, max, 0);
    }
}