package game8.world;

import arc.struct.Seq;
import arc.struct.IntSet;
import mindustry.gen.Building;
import game8.world.*;
import game8.world.blocks.production.*;

public interface PressureBuild {
    default float SystemPressure() {
        return 0f;
    }
    Seq<Building> updateSystem() {
        IntSet tracked = new IntSet();
        Seq<Building> isTracking = new Seq<Building>();
        Seq<Building> hasAccepted = new Seq<Building>();
        Seq<Building> willTrack = new Seq<Building>

        isTracking.add(this.proximity);

        while(!isTracking.isEmpty()) { // if queue is not empty
            for(Building current : isTracking) { // loop through each block in queue
                if(tracked.add(current.pos)) {
                    if(current instanceof PressureBuild) {
                        if(current.block.ConnectPressureSystems) {
                            willTrack.addAll(current.proximity);
                        }
                        hasAccepted.add(current);
                    }
                }
                isTracking.remove(current);
            }
            if(willTrack.isEmpty()) isTracking.addAll(current.proximity);
        }

        // now that flood-fill is finished

        for(Building current : hasAccepted) {
            if(current instanceof PressureBuild pb) {
                Seq<Building> sys = pb.system();
                sys.clear();
                sys.addAll(hasAccepted);
            }
        }

        return hasAccepted;
    }
}