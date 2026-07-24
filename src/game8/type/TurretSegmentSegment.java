package game8.type;

import arc.graphics.g2d.*;
import arc.struct.*;
import arc.math.geom.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.part.*;
import game8.type.*;
import java.lang.*;

public class TurretSegmentSegment {
    public float x, y, scale = 0f;
    public Seq<TurretSegmentSegment> turretSegments = new Seq<TurretSegmentSegment>();
    public Seq<Bullet> bullets;
    public Seq<Effect> ejectEffecs, shootEffects = Fx.none;
    /** im gonna try to make this ACTUALLY work. */
    public boolean flipSprite = false;
    public int layer = 0;
    public Seq<Integer> shootOrders;
    public Seq<DrawPart> parts = new Seq<>(DrawPart.class);
    public Seq<Pair<TextureRegion, Vec2>> textures;

    public TurretSegmentSegment() {}

    public void draw() {}
}