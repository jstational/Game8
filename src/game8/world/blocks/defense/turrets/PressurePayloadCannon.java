package game8.world.blocks.defense.turrets;

import mindustry.gen.Building;
import game8.world.blocks.defense.turrets.*;
import game8.world.*;
import arc.struct.Seq;
import game8.world.blocks;

public class PressurePayloadCannon extends PayloadCannon implements PressureBlock {
    public PressurePayloadCannon(String name) {
        super(name);
    }
    public class PressurePayloadCannonBuild extends PayloadCannonBuild implements PressureBuild {
        public Seq<Building> System = new Seq<>();
    }
}