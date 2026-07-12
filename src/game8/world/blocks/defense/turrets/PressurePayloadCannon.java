package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import game8.world.blocks.defense.turrets.*;
import arc.struct.Seq;
import game8.world.blocks.*;
import mindustry.world.blocks.payloads.Payload;

public class PressurePayloadCannon extends PayloadCannon {
    public PressureBlock pressureBlock = new PressureBlock();
    public float shootAt = 0f;

    public PressurePayloadCannon(String name) {
        super(name);
    }
    public class PressurePayloadCannonBuild extends PayloadCannonBuild {
        public PressureBuild pressureBuild = new PressureBuild();

        @Override
        public void shoot(float x, float y, Payload payload) {
            super.shoot(x, y, payload);
        }
    }
}