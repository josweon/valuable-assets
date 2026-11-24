package com.pluralsight;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private ArrayList<Valuable> valuables;

    public Portfolio() {

    }

    public void addValuable(Valuable valuable) {
        this.valuables.add(valuable);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
