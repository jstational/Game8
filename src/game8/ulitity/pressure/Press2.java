package game8.utility;

import game8.utility.pressure.*;
import arc.math.geom.*;

public class Press2 {
    public Press x;
    public Press y;
    public Vec2 value;
    public Press2(Press x, Press y) {
        this.x = x;
        this.y = y;
        this.value = new Vec2((float) x,(float) y);
    }
}