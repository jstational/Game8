package game8.type;

import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;

public class TurretSegmentSegment {
    public float x, y, scale = 0f;
    public Seq<TurretSegmentSegment> turretSegments = new Seq<TurretSegmentSegment>();
    public BulletType bullet = new BulletType();

    public TurretSegmentSegment() {}
}