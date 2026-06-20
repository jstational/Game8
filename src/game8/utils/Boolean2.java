package game8.utils;

public class Boolean2 {
    private final boolean valA;
    private final boolean valB;

    public Boolean2(boolean valA,boolean valB) {
        this.valA = valA;
        this.valB = valB;
    }

    public boolean identical(Boolean2 other) {
        return this.valA == other.valA && this.valB == other.valB;
    }
}