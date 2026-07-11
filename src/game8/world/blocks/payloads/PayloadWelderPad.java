package game8.world.blocks.payload;

import mindustry.world.Block;
import mindustry.gen.Building;

/** welds payloads on a pad that can be brought into a PayloadDuctAcceptor or collected by a PayloadCrane */
public class PayloadWelderPad extends Block {
    public PayloadWelderPad(String name) {
        super(name);
    }
    public class PayloadWelderPadBuild extends Building {}
}