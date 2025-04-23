package model;

import java.time.LocalDate;

public class Perishable {
    private String nameOfPerishable;
    private LocalDate expirationDate;

    public Perishable(String nameOfPerishable, LocalDate expirationDate) {
        this.nameOfPerishable = nameOfPerishable;
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        return expirationDate.isBefore(LocalDate.now());
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Perishable{" +
                "nameOfPerishable='" + nameOfPerishable + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }


}
