package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import static java.lang.Math;

public class BulletMine extends BaseBlock {
    public BulletType bullet = Bullets.placeholder;
    public float bulletDamage = 0f;
    public float bulletDamageRange = 0f;
    public float bulletVelocity = 0f;

    public BulletMine(String name) {
        super(name);
    }

    public class BulletMineBuild extends BaseBuild {
        public BulletMine block;

        public Bullet explode() {
            return bullet.create(this, this.team, this.x, this.y, random() * 360, block.bulletDamage + (((Math.random() - 1) * block.bulletDamageRange) - (block.bulletDamageRange / 2)), block.bulletVelocity)
            this.kill()
        }

        @Override
        public void updateTile() {
            super.updateTile();
        }
    }
}