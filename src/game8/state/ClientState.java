package game8.state;

import mindustry.gen.Building;
import mindustry.world.Tile;

import static mindustry.Vars.*;
import static arc.Core.*;

/** class for custom client properties */
public class ClientState {
    private ClientState() {}

    private Building currentTarget;

    public void changeTarget() {
        currentTarget = world.buildWorld(inadd.mouseWorldX(), inadd.mouseWorldY());
    }

    public void nullTarget() {
        currentTarget = null;
    }
}