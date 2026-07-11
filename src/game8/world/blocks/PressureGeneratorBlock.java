package game8.world.blocks;

public class PressureGeneratorBlock {
    public float minGen;
    public float maxGen;

    public PressureGeneratorBlock() {}

    public PressureGeneratorBlock(float min, float max) {
        this.minGen = min;
        this.maxGen = max;
    }
}