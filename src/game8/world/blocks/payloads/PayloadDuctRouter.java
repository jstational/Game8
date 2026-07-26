package game8.world.blocks.payloads;

import game8.world.*;
import mindustry.gen.Building;
import game8.struct.Quad;
import mindustry.world.blocks.payloads.*;

public class PayloadDuctRouter extends BaseBlock {
    public PayloadDuctRouter(String name) {
        super(name);
    }

    public class PayloadDuctRouterBuild extends BaseBuild {
        public Quad<Building> out;
        public int curOut;
    }
}