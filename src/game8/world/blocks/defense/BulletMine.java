package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import static java.lang.Math;

public class BulletMine extends BaseBlock {
    public BulletType bullet = Bullets.placeholder;
    public float bulletDamage = 0f;
    public float bulletVelocityMod = 0f;

    public BulletMine(String name) {
        super(name);
    }

    public class BulletMineBuild extends BaseBuild {
        public BulletMine block;

        public Bullet explode() {
            return bullet.create(this, this.team, this.x, this.y, random() * 360, block.bulletDamage, block.bulletVelocity);
            this.kill();
        }

        @Override
        public void updateTile() {
            super.updateTile();
        }
    }
}