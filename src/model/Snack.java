package model;

import javax.xml.namespace.QName;

public class Snack extends Perishable {

    private String flavor;
    private String name;

    public Snack(String name, String flavor, boolean expired) {
        super(expired);
        this.name = name;
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Snack ( " + name + " has the flavor " + flavor + " )";
    }
}
