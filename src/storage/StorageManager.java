package storage;

import java.util.ArrayList;
import java.util.List;

public class StorageManager<T>{

    private List<T> items;

    public StorageManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getAllItems() {
        return items;
    }

    public void displayAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

}
