package game8.world.blocks.distribution.items;

import mindustry.world.*;
import mindustry.gen.*;
import mindustry.entities.bullet.*;
import mindustry.content.*;
import java.util.Math;

public class BulletMine extends Block {
    public BulletType bullet = Bullets.placeholder;
    public float bulletDamage = 0f;
    public float bulletVelocityMod = 0f;

    public BulletMine(String name) {
        super(name);
    }

    public class BulletMineBuild extends Building {
        public BulletMine block;

        public Bullet explode() {
            this.kill();
            return block.bullet.create(this, this.team, this.x, this.y, Math.random() * 360, block.bulletDamage, block.bulletVelocity);
        }

        @Override
        public void updateTile() {
            super.updateTile();
        }
    }
}