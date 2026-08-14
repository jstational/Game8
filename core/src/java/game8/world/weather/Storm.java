package game8.world.weather;

import mindustry.type.*;
import game8.type.*;
import arc.graphics.*;

public class Storm extends Weather {
    public Lightning lightning;
    public float maxInterval;
    public float minInterval;
    
    public Storm(Lightning l, float mxi, float mni) {
        this.lightning = l;
        this.maxInterval = mxi;
        this.minInterval = mni;
    }
}