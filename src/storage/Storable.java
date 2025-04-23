package storage;

public interface Storable<T> {

    void save(T item);

    T load();
}
