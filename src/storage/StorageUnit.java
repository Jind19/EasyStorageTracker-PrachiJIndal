package storage;

public class StorageUnit<T> implements Storable<T>{
    private T item;

    public void addItem(T item) {
        this.save(item);
    }

    public T getItem() {
        return this.load();
    }

    @Override
    public void save(T item){
        this.item = item;
    }

    @Override
    public T load() {
        return item;
    }


}
