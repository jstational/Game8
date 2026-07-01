package game8.world;

import mindustry.world.Block;
import mindustry.gen.Building;
import mindustry.logic.*;

public class PressureLogicBlock extends Block {
    // you should be able to obtain these from an link:
    /** Pressure, Health, Ammo, Items, Liquids, ItemsCount, LiquidsCount, amt of a certain item, amt of a certain liquid */
    public static class PressureLogicLink {
        public int x, y;
        public String name;
        public Building build;

        public PressureLogicLink(int x, int y, String name) {
            this.x = x
            this.y = y
            this.name = name
        }
    }
    public class PressureLogicBuild extends Building {}
}