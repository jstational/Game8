package game8.type;

import java.lang.Math;

public class GMath {
    public int clamp(int in, int min, int max) {
        if(in < min) return min;
        if(in > max) return max;
        return in;
    }
}