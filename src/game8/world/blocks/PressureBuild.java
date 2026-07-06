package game8.world.blocks;

import arc.struct.Seq;
import mindustry.gen.Building;

public class PressureBuild {
    public boolean ProducingMax = false;
    public boolean SyncedToSystem = false;
    public Seq<Building> PressureSystem = new Seq<Building>();

    public PressureBuild() {}
}