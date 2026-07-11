package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;

/** brings blocks, units, or payloads on PayloadPad into another location */
public class PayloadCrane extends Block {
    public PayloadCrane(String name) {
        super(name);
    }
    public class PayloadCraneBuild extends Building {}
}