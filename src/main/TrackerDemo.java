package main;
//our packages
import model.*;
import storage.*;
//java package
import java.util.*;


public class TrackerDemo {

    public static void main(String[] args) {

        StorageUnit<Book> bookStorage = new StorageUnit<>();
        bookStorage.addItem(new Book("Alice", "Java Fundamentals"));

        StorageUnit<Device> deviceStorage = new StorageUnit<>();
        deviceStorage.addItem(new Device("Smartphone", "SN123456T"));

        StorageUnit<Snack> snackStorage = new StorageUnit<>();
        snackStorage.addItem(new Snack("Chips", "Cheese", false));

//        StorageUtils.displayItem(bookStorage.getItem());
//        StorageUtils.displayItem(deviceStorage.getItem());
//        StorageUtils.displayItem(snackStorage.getItem());
//
//        StorageUtils.checkPerishable(snackStorage.getItem());

//        List<Object> inventory = new ArrayList<>();
//        inventory.add(bookStorage.getItem());
//        inventory.add(deviceStorage.getItem());
//        inventory.add(snackStorage.getItem());
//
//        StorageUtils.printItems(inventory);

        StorageManager<Book> bookManager = new StorageManager<>();
        bookManager.addItem(new Book("Clean Code", "Robert C. Martin"));
        bookManager.addItem(new Book("Effective Java", "Joshua Bloch"));
        System.out.println("Books in Storage");
        bookManager.printAll();

    }
}
