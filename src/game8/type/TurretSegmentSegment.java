package game8.type;

import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.part.*;

public class TurretSegmentSegment {
    public float x, y, scale = 0f;
    public Seq<TurretSegmentSegment> turretSegments = new Seq<TurretSegmentSegment>();
    public BulletType bullet = Bullets.placeholder;
    public Effect ejectEffect = Fx.none;
    public Effect shootEffect = Fx.none;
    /** im gonna try to make this ACTUALLY work. */
    public boolean flipSprite = false;
    /** shootorder goes forward */
    public int shootOrder = 0;
    public DrawPart drawPart;

    public TurretSegmentSegment() {}
}