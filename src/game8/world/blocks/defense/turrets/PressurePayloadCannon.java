package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import game8.world.blocks.defense.turrets.*;
import arc.struct.Seq;
import game8.world.blocks.*;

public class PressurePayloadCannon extends PayloadCannon {
    public PressureBlock pressureBlock = new PressureBlock();

    public PressurePayloadCannon(String name) {
        super(name);
    }
    public class PressurePayloadCannonBuild extends PayloadCannonBuild {
        public PressureBuild pressureBuild = new PressureBuild();
    }
}