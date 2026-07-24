package game8.world.blocks.distribution.items;

import mindustry.gen.Building;
import arc.math.geom.*;
import arc.graphics.g2d.*;
import game8.world.*;
import game8.type.*;
import java.lang.Integer;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends BaseBlock {
    public TextureRegion extensionMidRegion;
    public TextureRegion extensionRegion;
    public TextureRegion clawRegion;
    public TextureRegion extensionClawRegion;

    public PayloadCrane(String name) {
        super(name);
    }

    public class PayloadCraneBuild extends BaseBuild {
        public PayloadCrane block;
        // checks these points if a building exists on them?
        // int: Order, Point1: Source position, Point2: To position
        public DuoHashMap<Integer, Point2, Point2> points = new DuoHashMap<>();
    }
}