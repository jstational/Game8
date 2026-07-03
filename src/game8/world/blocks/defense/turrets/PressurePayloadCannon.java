package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import game8.world.blocks.defense.turrets.*;
import game8.world.*;

public class PressurePayloadCannon extends PayloadCannon {
    public PressurePayloadCannon(String name) {
        super(name);
    }
    public class PressurePayloadCannonBuild extends PayloadCannonBuild implements PressureBuild {}
}