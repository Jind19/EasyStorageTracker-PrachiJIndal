package model;

import java.time.LocalDate;

public class Perishable {
    private boolean expired;

    public Perishable(boolean expired) {
        this.expired = expired;
    }

    public boolean isExpired() {
        return expired;
    }

    @Override
    public String toString() {
        return "Perishable: " +
                "expired=" + expired ;
    }
}
