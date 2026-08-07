package game8.world.units;

import mindustry.type.UnitType;
import game8.world.units.segments.*;
import arc.struct.Seq;

/** unit composed of segments */
public class SegmentedUnitType extends UnitType {
    /** private or public?? */
    /** segments connected to the unit itself */
    public Seq<Segment> rootSegments;

    public UnitType(name) {
        super(name);
    }
}