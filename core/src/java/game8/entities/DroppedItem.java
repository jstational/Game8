package game8.entities;

import game8.entities.*;
import mindustry.type.*;
import mindustry.gen.*;

public class DroppedItem extends DynamicEntity {
    public ItemStack items;

    public DroppedItem(ItemStack i) {
        this.items = i;
    }

    public DroppedItem(Item i) {
        this.items = new ItemStack(i, 1);
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void draw() {}

    public void collect(Unit u) {
        if(u.stack.amount + this.items.amount > u.itemCapacity()) {
            u.addItems(this.items.item, this.items.amount);
            this.destroy() {}
        }
    }

    @Override
    public void destroy() {}
}