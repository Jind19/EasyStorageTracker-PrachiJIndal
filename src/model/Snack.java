package model;

public class Snack {
    private String snackName;

    public Snack(String snackName) {
        this.snackName = snackName;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                '}';
    }
}
