package game8.world.blocks;

import mindustry.gen.Building;
import arc.struct.Seq;

public interface PressureBuild {
    void updateSystem();
    /**
     * trigger:
     * this.adjacent buildings must pass these requirements to be connected
     * instanceof (interface) game8.world.blocks.distribution.pressure.PressureConnector
     * or
     * isPartOfSystem
     */
    Seq<Building> getConnectedBuildings();
}