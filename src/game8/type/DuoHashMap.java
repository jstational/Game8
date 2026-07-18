package game8.type;

/** hashA and hashB can desync. */
/** uses one key for two values */
public class DuoHashMap<K, A, B> {
    private final HashMap<K, A> hashA = new HashMap<>();
    private final HashMap<K, B> hashB = new HashMap<>();

    public DuoHashMap() {}

    public static class Entry<A, B> {
        public final A a;
        public final B b;

        public Entry(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    public void putA(K key, A valA) {
        hashA.put(key, valA);
    }

    public void putB(K key, B valB) {
        hashB.put(key, valB);
    }

    public void put(K key, A valA, B valB) {
        hashA.put(key, valA);
        hashB.put(key, valB);
    }

    /** nulls key of hashB */
    public void replaceA(K key, A valA) {
        this.put(key, valA, null);
    }

    /** nulls key of hashA  */
    public void replaceB(K key, B valB) {
        this.put(key, null, valB);
    }

    /** removes key of hashB */
    public void overrideA(K key, A valA) {
        hashA.put(key, valA);
        hashB.remove(key);
    }

    /** removes key of hashA */
    public void overrideB(K key, B valB) {
        hashB.put(key, valB);
        hashA.remove(key);
    }

    public Entry<A, B> get(K key) {
        return new Entry<>(getA(key), getB(key));
    }

    public A getA(K key) {
        return hashA.get(key);
    }

    public B getB(K key) {
        return hashB.get(key);
    }

    public void clear() {
        hashA.clear();
        hashB.clear();
    }

    public void clearA() {
        hashA.clear();
    }

    public void clearB() {
        hashB.clear();
    }

    public void remove(K key) {
        hashA.remove(key);
        hashB.remove(key);
    }

    public void removeA(K key) {
        hashA.remove(key);
    }

    public void removeB(K key) {
        hashB.remove(key);
    }

    public int size() {
        return hashA.size() > hashB.size() ? hashA.size() : hashB.size();
    }

    public int sizeA() {
        return hashA.size();
    }

    public int sizeB() {
        return hashB.size();
    }
}