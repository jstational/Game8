package game8.interfaces;

import arc.struct.seq;
import mindustry.gen.Building;

public interface PressureBlock {
    Seq<Building> system();
    Float localpressure();
    Float pressure();
}