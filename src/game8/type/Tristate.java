package game8.type;

import java.lang.Math;

/** Balanced or unbalanced tribool */
public class Tristate implements Comparable<Tristate> {
    private boolean valA;
    private boolean valB;

    private boolean balanced;

    public Tristate(boolean a, boolean b) {
        this(a, b, false);
    }

    public Tristate(int val) {
        if(val > 2 || val < 0) { throw new IllegalArgumentException("Tristate: Int must not be less than 0 or greater than 2. " + Integer.toString(val)); }
        this(val > 0, val == 2, false);
    }

    public Tristate(int val, boolean balanced) {
        if(val > 2 || val < 0) { throw new IllegalArgumentException("Tristate: Int must not be less than " + (balanced ? "-1" : "0") + " or greater than " + (balanced ? "1" : "2") + Integer.toString(val)); }
        this(val > (balanced ? -1 : 0), val == (balanced ? 1 : 2), balanced);
    }

    public Tristate(float val) {
        if(val > 2f || val < 0f) { throw new IllegalArgumentException("Tristate: Float must not be less than 0f or greater than 2f. " + Float.toString(val)); }
        this(Math.floor(val) > 0f, Math.floor(val) == 2f, false);
    }

    public Tristate(float val, boolean balanced) {
        if(val > 2f || val < 0f) { throw new IllegalArgumentException("Tristate: Float must not be less than " + (balanced ? "-1" : "0") + " or greater than " + (balanced ? "1" : "2") + Float.toString(val)); }
        this(Math.floor(val) > (balanced ? -1f : 0f), val == (balanced ? 1f : 2f), balanced);
    }

    public Tristate(boolean a, boolean b, boolean balanced) {
        this.valA = a;
        this.valB = b;
        this.balanced = balanced;
    }

    public boolean is1() {
        return balanced ? this.valA && this.valB : this.valA && !this.valB;
    }

    public boolean is0() {
        return balanced ? this.valA && !this.valB : !this.valA;
    }

    public boolean is2() {
        return this.valA && this.valB;
    }

    public boolean balanced() {
        return this.balanced;
    }

    public boolean isNeg1() {
        return !this.valA;
    }

    public int intVal() {
        if (!this.valA) return this.balanced ? -1 : 0;
        if (this.balanced) return this.valB ? 1 : 0;
        return this.valB ? 2 : 1;
    }

    public int uIntVal() {
        return valA ? valB ? 2 : 1 : 0;
    }

    public int bIntVal() {
        return valA ? valB ? 1 : 0 : -1;
    }

    @Override
    public int compareTo(Tristate other) {
        return (this.intVal() == other.intVal()) ? 1 : 0;
    }

    public boolean equals(Object other) {
        if(!other instanceof Tristate) { throw new IllegalArgumentException("Tristate: Cannot compare another class to a Tristate!") }
        return this.compareTo(other);
    }

    public boolean trueEqual(Tristate other) {
        return this.uIntVal() == other.uIntVal();
    }
}