package game8.interfaces;

import arc.struct.Seq;
import mindustry.gen.Building;

public interface PressureBlock {
    Seq<Building> system();
    Float localpressure();
    Float pressure();
}