package Arv_polymorfi.forberedselse;

public class Truck extends Vehicle {

  private int numberOfContainers;

  public Truck(String brand, int numberOfDoors, int numberOfWheels, FuelType fuelType, int numberOfContainers) {
    super(brand, numberOfDoors, numberOfWheels, fuelType);
    this.numberOfContainers = numberOfContainers;
  }

  @Override
  public void makeSound() {
    System.out.println("Truck sound");
  }

  @Override
  public String toString() {
    return "Truck{" +
        "\nnumberOfContainers=" + numberOfContainers +
        "\nbrand='" + brand + '\'' +
        "\nnumberOfDoors=" + numberOfDoors +
        "\nnumberOfWheels=" + numberOfWheels +
        "\nfuelType=" + fuelType +
        "\n}\n";
  }
}
