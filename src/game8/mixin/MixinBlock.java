package game8.mixin;

import mindustry.world.Block;
import game8.utils.Press2;
import mindustry.annotations.Annotations.*;
import game8.interfaces;
import mindustry.ctype.UnlockableContent;
import mindustry.world.Build;
import mindustry.gen.Building;

@Mixin(Blocks.class)
public class MixinBlock extends UnlockableContent implements PressureBlock {
    // false, no pressure module
    public @NoPatch boolean HasPressure = false;
    public float Volume = 0;
    public Press2 MaxPress = new Press2(0,0);
    public class PressureInternal extends Building {
        public boolean willACT = false;
    }
}