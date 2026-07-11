package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;

/** accepts payloads and sends them forward */
public class PayloadDuctAcceptor extends Block {
    public PayloadDuctAcceptor(String name) {
        super(name);
    }
    public class PayloadDuctAcceptorBuild extends Building {}
}