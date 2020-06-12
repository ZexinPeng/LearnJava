package pers.linus.lamda;

public interface Transform<K, V> {
    Integer transform(K k, V v);
}
