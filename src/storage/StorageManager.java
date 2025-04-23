package storage;

import java.util.ArrayList;
import java.util.List;

public class StorageManager<T>{

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

}
