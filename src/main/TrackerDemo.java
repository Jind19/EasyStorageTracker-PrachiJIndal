package main;

import model.Book;
import model.Device;
import model.Perishable;
import model.Snack;
import storage.StorageUnit;
import storage.StorageUtils;

import java.time.LocalDate;

public class TrackerDemo {

    public static void main(String[] args) {

        StorageUnit<Book> book1 = new StorageUnit<Book>();
        StorageUnit<Device> device1 = new StorageUnit<Device>();
        StorageUnit<Snack> snack1 = new StorageUnit<Snack>();
        StorageUnit<Perishable> perishable1 = new StorageUnit<>();

        book1.addItem(new Book("Harry Potter"));
        device1.addItem(new Device("Iphone16Pro"));
        snack1.addItem(new Snack("Pizza"));
        perishable1.addItem(new Perishable("Milk", LocalDate.of(2025, 7, 25)));


        StorageUtils.printStorageUnitItems(book1);
        StorageUtils.printStorageUnitItems(device1);
        StorageUtils.printStorageUnitItems(snack1);
        StorageUtils.printStorageUnitItems(perishable1);





    }
}
