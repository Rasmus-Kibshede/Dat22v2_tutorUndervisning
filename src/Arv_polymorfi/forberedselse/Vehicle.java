package Arv_polymorfi.forberedselse;

public abstract class Vehicle {

  protected String brand;
  protected int numberOfDoors;
  protected int numberOfWheels;
  protected FuelType fuelType;

  public Vehicle(String brand, int numberOfDoors, int numberOfWheels, FuelType fuelType) {
    this.brand = brand;
    this.numberOfDoors = numberOfDoors;
    this.numberOfWheels = numberOfWheels;
    this.fuelType = fuelType;
  }

  public abstract void makeSound();

  public String getBrand() {
    return brand;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public FuelType getFuelType() {
    return fuelType;
  }
}
