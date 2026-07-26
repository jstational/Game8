package game8.struct;

import mindustry.type.*;
import mindustry.world.blocks.payloads.*;
import arc.struct.Seq;

public class ConsumeSeq {
    private Seq<ItemStack> items;
    private Seq<Item> item;
    private Seq<LiquidStack> liquids;
    private Seq<Liquid> liquid;
    private Seq<PayloadStack> payloads;
    private Seq<Payload> payload;
    private int power;
    private float pressureLow, pressureHigh;

    public ConsumeSeq() {}
    
    public ConsumeSeq(int power, float pressureLow, float pressureHigh) {
        this.power = power;
        this.pressureLow = pressureLow;
        this.pressureHigh = pressureHigh;
    }

    public boolean exists(ItemStack items) {
        return this.items.contains(items);
    }

    public boolean exists(Item item) {
        return this.item.contains(item);
    }
}