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
    public Seq<TurretSegmentSegment> turretSegments;
    public Seq<Bullet> bullets;
    public Seq<Effect> ejectEffects, shootEffects;
    /** im gonna try to make this ACTUALLY work. */
    public boolean flipSprite = false;
    public int layer = 0;
    public IntSeq shootOrders;
    public Seq<DrawPart> parts;
    public TextureRegion texture;

    public TurretSegmentSegment(float x, float y, float scl, Seq<TurretSegmentSegment> ts, Seq<Bullet> blts, Seq<Effect> ejfx, Seq<Effect> sofx, boolean flip, int lr, IntSeq soor, Seq<DrawPart> dps, TextureRegion txt) {
        this.x = x;
        this.y = y;
        this.scale = scl;
        this.turretSegments = ts;
        this.bullets = blts;
        this.ejectEffects = ejfx;
        this.shootEffects = sofx;
        this.flipSprite = fs;
        this.layer = lr;
        this.shootOrders = soor;
        this.parts = dps;
        this.texture = txt;
    }

    public void draw() {}
}