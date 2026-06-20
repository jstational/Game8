package game8.mixin;

import mindustry.world.Block;
import arc.math.geom.Press2;
import mindustry.annotations.Annotations.*;
import game8.interfaces;

@Mixin(Blocks.class)
public class MixinBlock extends UnlockableContent implements PressureBlock {
    // if true, then this building has an PressureModule. uhhuh am now.
    public @NoPatch boolean HasPressure;
    // testing... if null, will not consume/produce pressure
    public @Nullable Press2 PressureConfig;
    public boolean ProducePressure;
}