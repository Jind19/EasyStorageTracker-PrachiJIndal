package main;

import model.Book;
import model.Device;
import model.Snack;
import storage.StorageUnit;
import storage.StorageUtils;

public class TrackerDemo {

    public static void main(String[] args) {

        StorageUnit<Book> book1 = new StorageUnit<Book>();
        StorageUnit<Device> device1 = new StorageUnit<Device>();
        StorageUnit<Snack> snack1 = new StorageUnit<Snack>();

        book1.addItem(new Book("Harry Potter"));
        device1.addItem(new Device("Iphone16Pro"));
        snack1.addItem(new Snack("Pizza"));

        StorageUtils.printStorageUnitItems(book1);
        StorageUtils.printStorageUnitItems(device1);
        StorageUtils.printStorageUnitItems(snack1);




    }
}
