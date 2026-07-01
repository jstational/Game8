package game8.world;

import arc.struct.Seq;
import mindustry.gen.Building;

public interface PressureBuild {
    Seq<Building> System();
    Float Pressure();
    Float Volume();
}