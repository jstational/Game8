package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends BaseBlock {
    public PayloadCrane(String name) {
        super(name);
    }

    public class PayloadCraneBuild extends BaseBuild {}
}