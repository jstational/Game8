package game8.type;

import java.util.HashMap;
import arc.struct.Seq;
import java.lang.Integer;

public class IndexedMap<T> {
    private HashMap<Integer, T> map;
    private Seq<Integer> missingKeys;
    private int nextKey = 0;

    public IndexedMap() {}

    public void put(T object) {
        // TODO make the nextKey and missingKeys system actually work
        map.put(this.nextKey, object);
    }
}