package game8.type;

import arc.graphics.g2d.*;
import arc.struct.*;
import game8.type.*;

public class TurretSegment {
    public TextureRegion turretBase = new TextureRegion();
    public Seq<TurretSegmentSegment> turretSegments = new Seq<TurretSegmentSegment>();

    public TurretSegment() {}
}