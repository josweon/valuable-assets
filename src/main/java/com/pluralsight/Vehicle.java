package com.pluralsight;

public abstract class Vehicle implements Valuable{
    private String makeModel;
    private double initialCost;
    private int initialMileage;
    private int currentMileage;
    public static final double DEPRECIATION_PER_MILE = 0.05;

    public Vehicle(String makeModel, double initialCost, int initialMileage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
        this.currentMileage += initialMileage;
    }

    public void drive(int miles) {
        this.currentMileage += initialMileage;
    }
}
