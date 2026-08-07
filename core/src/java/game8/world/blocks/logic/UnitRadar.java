package game8.world.blocks.logic;

import mindustry.world.*;
import mindustry.gen.Building;
import static mindustry.Vars.player;

/** detects units */
public class UnitRadar extends Block {
    public float range = 0f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends Building {
        public boolean detectsAllies = false;

        @Override
        public void configureAny(Object value) {
            super.configureAny(value);
            /** TODO what this might do on a server? */
            if (!interactable(player.team())) return;
            this.detectsAllies = !this.detectsAllies;
        }
    }
}