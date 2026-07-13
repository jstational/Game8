package game8.world.blocks.defense.turrets;

import game8.world.*;
import mindustry.gen.*;
import mindustry.world.blocks.payloads.Payload;

public class PayloadCannon extends BaseBlock {
    public PayloadCannon(String name) {
        super(name);
    }

    public class PayloadCannonBuild extends BaseBuild {
        public void shoot(float x, float y, Payload payload) {}
    }
}