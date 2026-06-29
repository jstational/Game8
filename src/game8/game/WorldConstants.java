package game8.game;

public class WorldConstants {
    public float Floor = 0f;
    public float Ore = 0.1f;
    public float WallHeight = 15f;
    public float BlockHeight = 2f;
    public float TallBlockHeight = 4f;
    public float TreeHeight = 5f;
    /** When to use this? */
    public float CliffSub = -1f;
    public float CliffAdd = 1f;
    /** I dont know how to implement this */
    public float Liquid = -0.4f;
    /** For Submarine unit types! */
    public float SeaBedShallow = -0.7f;
    public float SeaBed = -8f;
    /** I dont know, this should depend on the current planet's MaxAtmosphere! */
    public float WorldAtmosphereHeight = 1000f;
    public float WorldDefaultGravity = 2.3f;
}