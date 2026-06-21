package game8.utils;

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
} // oh no ???