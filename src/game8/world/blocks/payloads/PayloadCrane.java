package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import game8.type.*;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends BaseBlock {
    public PayloadCrane(String name) {
        super(name);
    }

    public class PayloadCraneBuild extends BaseBuild {
        public PayloadCrane block;
        // checks these points if a building exists on them?
        public DuoHashMap<Int, Point2, Point2> points = new DuoHashMap<>();
    }
}