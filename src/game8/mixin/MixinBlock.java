package game8.mixin;

import mindustry.world.Block;
import game8.utils.Press2;
import mindustry.annotations.Annotations.*;
import game8.interfaces.*;
import mindustry.ctype.UnlockableContent;
import mindustry.world.Build;
import mindustry.gen.Building;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Block.class)
public abstract class MixinBlock extends UnlockableContent implements PressureBlock {
    // false, no pressure module
    @Unique public @NoPatch boolean hasPressure = false;
    @Unique public float Volume = 0;
    @Unique public Press2 MaxPress = new Press2(0,0);
}