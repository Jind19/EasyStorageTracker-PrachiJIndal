package storage;

import model.Perishable;

import java.util.List;

public class StorageUtils {

    //wildcard method
    public static void printStorageUnitItems(StorageUnit<? extends Object> item){
        System.out.println("Storage Unit contains: " + item.getItem());
    }

    //Wildcard list method
    public static void printItems(List<? extends Object> items){
        for(Object item: items){
            System.out.println(item);
        }
    }

    //Generic method
    public static <T> void displayItem(T item) {
        System.out.println("Displaying item: " + item);
    }

    // 📌 Bounded Type Method
    public static <T extends Perishable> void checkPerishable(T item) {
        if (item.isExpired()) {
            System.out.println("Warning: This item is expired.");
        } else {
            System.out.println("This item is still good.");
        }
    }
}
