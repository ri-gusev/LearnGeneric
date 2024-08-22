public class Box<K, V, E> {
    private K key;
    private V value1;
    private E value2;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue1() {
        return value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }

    public E getValue2() {
        return value2;
    }

    public void setValue2(E value2) {
        this.value2 = value2;
    }

    public Box(K key, V value1, E value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }
}
