package game8.logic;

public class PLVar {
    public String label = "";
    public Object value = 0f;

    public PLVar(String name) {
        this.label = name;
    }

    public boolean Set(String name, Float value) {
        if(value == this.value) {
            return false;
        } else {
            this.value = (Object) value;
            return true;
        }
    }
}