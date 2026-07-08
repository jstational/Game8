package game8.logic;

public class PLVar {
    public String Label = "";
    public float Value = 0f;

    public PLVar(String name) {
        this.Label = name;
    }

    public boolean Set(String name, Float value) {
        if(value == this.Value) {
            return false;
        } else {
            this.Value = value;
            return true;
        }
    }
}