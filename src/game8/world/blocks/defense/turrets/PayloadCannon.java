package game8.world.blocks.defense.turrets;

import mindustry.world.Block;
import mindustry.gen.*;

public class PayloadCannon extends Block {
    public PayloadCannon(String name) {
        super(name);
    }
    public class PayloadCannonBuild extends Building {
        public void shoot(float x, float y, Unit payload) {}

        public void shoot(float x, float y, Block payload) {}
    }
}