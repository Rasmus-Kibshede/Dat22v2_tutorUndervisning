package Arv_polymorfi.undervisning;

public abstract class Vehicle {

    //Field
    protected String brand;
    protected String color;
    protected int numberOfWheels;
    protected double hk;
    protected Fuel fuel;

    public Vehicle(String brand, String color, int numberOfWheels, double hk, Fuel fuel) {
        this.brand = brand;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.hk = hk;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getHk() {
        return hk;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public abstract void makeSound();
}
