package game8.world;

import mindustry.gen.Building;
import arc.struct.Seq;
import game8.utils.Util;
import mindustry.world.blocks.*;
import game8.world.blocks.*;
import game8.utils.Grouping;

/** PressureSystem is supposed to be a data type based off of Grouping.
 * This will have merging two or more PressureSystems based on a single Building, Splitting into more PressureSystems based on a Building contained in the PressureSystem 
 * This should ONLY be obtained by Building.PressureSystem.
 * It should always call Update on split or merge. */
// oh no not this again
// I dont know a single thing about dynamic stuff

public class PressureSystem {
    private final Grouping buildings;

    public PressureSystem(Grouping blds) {}

    public PressureSystem StaticNewSystem(Building build) {
        Grouping.getGrouping(build, "HasPressure", (Object) true);
    }
    public void DynamicNewSystem(Building build) {}
    public void Update(Building build) {}
    public void Merge(Building build) {}
    public void Split(Building build) {}
}