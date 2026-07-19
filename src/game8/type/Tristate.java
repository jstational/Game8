package game8.type;

/** Balanced or unbalanced tribool */
public class Tristate {
    private final boolean valA;
    private final boolean valB;

    private final boolean balanced;

    public Tristate(boolean a, boolean b) {
        this(a, b, false);
    }

    public Tristate(int val) {
        this(val > 0, val == 2, false);
    }

    public Tristate(int val, boolean balanced) {
        this(val > (balanced ? -1 : 0), val == (balanced ? 1 : 2), balanced);
    }

    public Tristate(float val) {
        this(Math.floor(val) > 0f, Math.floor(val) == 2f, false);
    }

    public Tristate(float val, boolean balanced) {
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

    public boolean equal(Tristate other) {
        return this.intVal() == other.intVal();
    }

    public boolean trueEqual(Tristate other) {
        return this.uIntVal() == other.uIntVal();
    }
}