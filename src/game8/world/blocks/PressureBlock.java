package  game8.world.blocks;

public class PressureBlock {
    public float MaxPressure;
    public float MinPressure;
    public float Volume;
    public boolean ConnectPressureSystems;

    public float MaxGeneratedPressure;
    public float MinGeneratedPressure;
    public boolean GeneratePressure;

    public PressureBlock() {
        this.MaxPressure = 0f;
        this.MinPressure = 0f;
        this.Volume = 0f;
        this.ConnectPressureSystems = false;
        this.MaxGeneratedPressure = 0f;
        this.MinGeneratedPressure = 0f;
        this.GeneratePressure = false;
    }
}