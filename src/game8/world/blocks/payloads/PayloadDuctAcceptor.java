package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;

/** accepts payloads and sends them forward */
public class PayloadDuctAcceptor extends BaseBlock {
    public PayloadDuctAcceptor(String name) {
        super(name);
    }

    public class PayloadDuctAcceptorBuild extends BaseBuild {}
}