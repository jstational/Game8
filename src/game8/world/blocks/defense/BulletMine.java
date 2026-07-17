package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.entities.bullet.*;
import mindustry.content.*;

public class BulletMine extends BaseBlock {
    public BulletType bullet = Bullets.placeholder;

    public BulletMine(String name) {
        super(name);
    }

    public class BulletMineBuild extends BaseBuild {
        public void explode() {}

        @Override
        public void updateTile() {
            super.updateTile();
        }
    }
}