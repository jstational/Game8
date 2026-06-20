package game8.utils;

import game8.utils.Boolean2;

public class Press2 {
    private final float least;
    private final float greatest;

    public Press2(float least, float greatest) {
        this.least = least;
        this.greatest = greatest;
    }
    
    public Boolean2 checkval(Press2 other) {
        return new Boolean2 ((this.least == other.least),(this.greatest == other.greatest));
    }

    public Boolean2 checkval(float other) {
        return new Boolean2 ((this.least == other),(this.greatest == other));
    }
}