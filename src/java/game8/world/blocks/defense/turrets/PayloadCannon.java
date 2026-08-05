package game8.world.blocks.defense.turrets;

import mindustry.world.*;
import mindustry.gen.*;
import mindustry.world.blocks.payloads.Payload;
import game8.type.*;

public class PayloadCannon extends Block {
    public TurretSegment turret = new TurretSegment();

    public PayloadCannon(String name) {
        super(name);
    }

    public class PayloadCannonBuild extends BaseBuild {
        public void shoot(float x, float y, Payload payload) {}
    }
}