package game8.type;

import arc.graphics.g2d.*;
import arc.struct.*;
import game8.type.*;

public class TurretSegment {
    public Seq<TurretSegmentSegment> turretSegments = new Seq<TurretSegmentSegment>();

    public TurretSegment(Seq<TurretSegmentSegment> tss) {
        this.turretSegments = tss;
    }

    public void draw(float x, float y, float rot) {}
    
    public void shoot(float x, float y, float rot) {}
}