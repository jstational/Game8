package game8.world.blocks.logic;

import game8.world.*;
import mindustry.gen.Building;
import static mindustry.Vars.player;

/** detects units */
public class UnitRadar extends BaseBlock {
    public float range = 0f;

    public UnitRadar(String name) {
        super(name);
    }

    public class UnitRadarBuild extends BaseBuild {
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