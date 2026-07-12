package game8.logic;

public class PLVar {
    private float value = 0f;

    public PLVar(float value) {
        this.value = value;
    }

    public boolean set(float value) {
        if(value == this.value) {
            return false;
        } else {
            this.value = value;
            return true;
        }
    }

    public boolean reset() {
        if(value == 0f) {
            return false;
        } else {
            this.value = 0f;
            return true;
        }
    }

    public float getValue() {
        return this.value;
    }
}