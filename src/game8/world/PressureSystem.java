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
 * It should always call Update on split or merge. 
 * To get SystemPressure, it should calculate the total output of ALL PressureGenerators in the system divided by ( The total volume of all blocks + 1 ). */
// oh no not this again
// I dont know a single thing about dynamic stuff
// how do i obtain a pressuresystem of a building without checking every time?
// i have an idea: for every adjacent update, check the whole system that it is in and remap all pressys of the grouping accordingly

public class PressureSystem {
    private final Grouping buildings;

    public PressureSystem(Grouping builds) {
        this.buildings = builds;
    }

    public static PressureSystem getSystem(Building build) {
        return new PressureSystem(Grouping.getGrouping(build, "hasPressure", (Object) true));
    }
    public static void Update(Building build) {}
    public static void Merge(Building build) {}
    public static void Split(Building build) {}
    public static float SystemPressure(PressureSystem system) {
        return 0f;
    }
}