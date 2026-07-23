package game8.type;

import mindustry.type.*;
import arc.struct.Seq;

public class ConsumeSeq {
    public Seq<ItemStack> items;
    public Seq<LiquidStack> liquids;
    public Seq<PayloadStack> payloads;
    public int power;
    public float pressureLow, pressureHigh;

    public ConsumeSeq() {}
    
    public ConsumeSeq(int power, float pressureLow, float pressureHigh) {
        this.power = power;
        this.pressureLow = pressureLow;
        this.pressureHigh = pressureHigh;
    }

    public boolean containsItem(Item item) {
        return false;
    }
}