package storage;

import model.Perishable;
import java.util.List;

public class StorageUtils {

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
        System.out.println("Perishable check: " + (item.isExpired() ? "Expired" : "Fresh"));
    }
}
