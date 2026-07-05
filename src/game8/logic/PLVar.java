package game8.logic;

public class PLVar {
    public String label = "";
    public Object value = 0f;

    public PLVar(String name) {
        this.label = name;
    }

    public boolean Set(String name, Float value) {
        this.value = (Object) value;
        return false;
    }
}