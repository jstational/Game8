package game8.type;

import arc.struct.Seq;

public class IndexedMap<T> {
    private HashMap<int, T> map;
    private Seq<int> missingKeys;
    private int nextKey = 0;

    public IndexedMap() {
        return new IndexedMap<T>;
    }

    public void put(T object) {
        map.put(object);
    }
}