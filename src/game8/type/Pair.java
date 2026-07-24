package game8.type;

public class Pair<A, B> {
    private A objectA;
    private B objectB;

    public Pair(A a, B b) {
        this.objectA = a;
        this.objectB = b;
    }

    public A getA() {
        return objectA;
    }

    public B getB() {
        return objectB;
    }

    public void setA(A a) {
        this.objectA = a;
    }

    public void setB(B b) {
        this.objectB = b;
    }
}