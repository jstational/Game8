package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** accepts payloads and sends them forward */
public class PayloadDuctAcceptor extends BaseBlock {
    public float moveDelay = 0f;

    public PayloadDuctAcceptor(String name) {
        super(name);
    }

    public class PayloadDuctAcceptorBuild extends BaseBuild {
        public Building out;
        public Payload payload;
    }
}