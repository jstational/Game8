package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import game8.type.*;
import arc.math.geom.*;
import java.lang.Integer;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends BaseBlock {
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