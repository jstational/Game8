package game8.world.blocks.distribution.items;

import mindustry.world.Block;
import mindustry.gen.Building;
import mindustry.entities.bullet.*;

public class BulletMine extends Block {
    public BulletType bullet;

    public BulletMine(String name) {
        super(name);
    }
    public class BulletMineBuild extends Building {}
}