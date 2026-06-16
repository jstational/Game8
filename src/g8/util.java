package game8;

import mindustry.gen.Building;
import mindustry.world.Block;
import arc.struct.Seq;
import arc.struct.IntSet;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Util {

    private static final Map<String, Field> fieldsCache = new HashMap<>();

    public static Object contentField (Block target, String field) {
        if (target == null || field == null) return null;
        try {
            Field foundField = fieldsCache.get(target.name + ":" + field);
            if (foundField == null) {
                foundField = target.getClass().getField(field);
                foundField.setAccessible(true);
                fieldsCache.put(target.name + ":" + field, foundField);
            }
            return foundField.get(target);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return null;
        }
    }

    public static Object contentField (Building target, String field) {
    if (target == null || field == null) return null;
        try {
            Field foundField = fieldsCache.get(target.block.name + ":" + field);
            if (foundField == null) {
                foundField = target.block.getClass().getField(field);
                foundField.setAccessible(true);
                fieldsCache.put(target.block.name + ":" + field, foundField);
            }
            return foundField.get(target.block);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return null;
        }
    }

    @SafeVarargs
    public static boolean isInstanceOf (Building target, Class<? extends Block>... classes) {
        if (target == null) return false;
        for (Class<? extends Block> cls : classes) {
            if (cls.isInstance(target.block)) {
                return true;
            }
        }
        return false;
    }
    @SafeVarargs
    public static boolean isInstanceOf (Block target, Class<? extends Block>... classes) {
            if (target == null) return false;
            for (Class<? extends Block> cls : classes) {
                if (cls.isInstance(target)) {
                   return true;
                }
            }
        return false;
    }
    @SafeVarargs
    public static Seq<Building> getGrouping(Building target, Class<? extends Block>... classes) {
        Seq<Building> outseq = new Seq<>();
        Seq<Building> tracking = new Seq<>();
        IntSet trackingPos = new IntSet();
        tracking.add(target);
        trackingPos.add(target.pos());
        while(!tracking.isEmpty()){
            Building cur = tracking.remove(0);
            outseq.add(cur);
            cur.proximity.each(other -> {
                if(!trackingPos.contains(other.pos()) && other.team == target.team && isInstanceOf(other, classes)) {
                    trackingPos.add(other.pos());
                    tracking.add(other);
                }
            });
        }
        return outseq;
    }
}