package game8.utils;

import mindustry.gen.Building;
import mindustry.world.Block;
import arc.struct.Seq;
public class Util {
    @SafeVarargs
    public static boolean isInstanceOf (Building target, Class<? extends Block>... classes) {
        if (target == null) return false;
        return isInstanceOf(target.block, classes)
        }
    }
    @SafeVarargs
        public static boolean isInstanceOf (Block target, Class<? extends Block>... classes) {
            if (target == null) return false;
         for (Class<? extends Block> cls : classes) {
            if (cls.isInstance(target))
        }
    }
    public GetGrouping(Building build, Class<? extends Block>... classes) {
        // wait
    }
}