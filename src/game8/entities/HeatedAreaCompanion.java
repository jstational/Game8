package game8.entities;

import mindustry.world.*;
import game8.type.*;

public class HeatedAreaCompanion {
    /** this will be checked for every tick, i may or may not add many fields to this so i dont know what i should do */
    private DuoHashMap<Block, Block, Float> changeSet = new DuoHashMap<>();

    public HeatedAreaCompanion() {}

    public boolean canMeltBlock(Tile tile, float heat) {
        Block block = tile.build == null ? null : tile.build.block;

        if(block == null) return false;
        if(!changeSet.contains(block)) return false;
        if(changeSet.getB(block) <= heat) return true;
    }

    public boolean canMeltFloor(Tile tile, float heat) {
        Block floor = tile.floor();

        if(!changeSet.contains(floor)) return false;
        if(changeSet.getB(floor) <= heat) return true;
    }
}