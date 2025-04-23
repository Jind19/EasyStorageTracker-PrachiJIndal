package storage;

public class StorageUtils {

    public static void printStorageUnitItems(StorageUnit<? extends Object> item){
        System.out.println("Storage Unit contains: " + item.getItem());
    }
}
