package game8.type;

/** sequence of 4 or less objects cause i dont know help */
public class Quad<T> {
    private T object1;
    private T object2;
    private T object3;
    private T object4;

    private int usedSlots = 0;
    private int unusedSlots = 4;

    public int usedSlots() {
        return this.usedSlots;
    }
    public int unusedSlots() {
        return 4 - usedSlots();
    }

    public boolean slotUsed(int index) {
        if(index > 0 && index <= 4) {
            if(this.usedSlots == 4) return true;
            if(this.usedSlots == 0) return false;
            if(index == 1) return this.object1 == null;
            if(index == 2) return this.object2 == null;
            if(index == 3) return this.object3 == null;
            if(index == 4) return this.object4 == null;
        }
        return false;
    }

    public boolean slotUnused(int index) {
        return !slotUsed(index);
    }

    public int lastUnusedSlot() {
        if(this.unusedSlots == 0) return 0;
        if(object4 == null) return 4;
        if(object3 == null) return 3;
        if(object2 == null) return 2;
        if(object1 == null) return 1;
        return 0;
    }

    public int firstUnusedSlot() {
        if(this.unusedSlots == 0) return 0;
        if(object1 == null) return 1;
        if(object2 == null) return 2;
        if(object3 == null) return 3;
        if(object4 == null) return 4;
        return 0;
    }

    public int lastUsedSlot() {
        if(this.usedSlots == 0) return 0;
        if(object4 != null) return 4;
        if(object3 != null) return 3;
        if(object2 != null) return 2;
        if(object1 != null) return 1;
        return 0;
    }

    public int firstUsedSlot() {
        if(this.usedSlots == 0) return 0;
        if(object1 != null) return 1;
        if(object2 != null) return 2;
        if(object3 != null) return 3;
        if(object4 != null) return 4;
        return 0;
    }

    public boolean remove(int index) {
        if(index > 0 && index <= 4) {
            if(this.usedSlots == 0) return false;
            if(!this.slotUsed(index)) return false;
            if(index == 1) {
                this.object1 = null;
                return true;
            }
            if(index == 2) {
                this.object2 = null;
                return true;
            }
            if(index == 3) {
                this.object3 = null;
                return true;
            }
            if(index == 4) {
                this.object4 = null;
                return true;
            }
        }
        return false;
    }

    public boolean add(int index, T object) {
        if(index > 0 && index <= 4) {
            if(index == 1) {
                this.object1 = object;
                return true;
            }
            if(index == 2) {
                this.object2 = object;
                return true;
            }
            if(index == 3) {
                this.object3 = object;
                return true;
            }
            if(index == 4) {
                this.object4 = object;
                return true;
            }
        }
        return false;
    }

    public boolean full() {
        return this.usedSlots == 4;
    }

    public boolean empty() {
        return this.usedSlots == 0;
    }
}