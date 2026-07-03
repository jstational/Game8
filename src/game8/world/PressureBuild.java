package game8.world;

import arc.struct.Seq;
import arc.struct.IntSet;
import mindustry.gen.Building;

public interface PressureBuild {
    Seq<Building> System;
    Seq<Building> System() {
        return System;
    };
    float Pressure() {
        private float SysTotalPressure;
        private float SysFinalPressure;

        return SysFinalPress;
    }
    float Volume();
    Seq<Building> updateSystem() {
        IntSet tracked = new IntSet();
        Seq<Building> isTracking = new Seq<Building>();
        Seq<Building> hasAccepted = new Seq<Building>();

        isTracking.add(this.proximity);

        while(!isTracking.isEmpty) { // if queue is not empty
            for(Building current : isTracking) { // loop through each block in queue
                if(tracked.add(current.pos) /** adds this position into tracked */ && current.block.ConnectPressureSystems == true) { /** checks if this build is a build to return */
                    hasAccepted.add(current);
                    isTracking.add(current.proximity);
                }
                isTracking.remove(current);
            }
        } // once queue is empty...

        // now that flood-fill is finished...

        for(Building current : hasAccepted) {
            current.System.clear();
            current.System.add(hasAccepted);
        }

        return hasAccepted;
    }
    public boolean IsPressureBuild = true;
}