package Arv_polymorfi.forberedselse;

import java.util.ArrayList;

public class Bus extends Vehicle {

  private int numberOfStops;
  private ArrayList<String> stopNames;

  public Bus(String brand, int numberOfDoors, int numberOfWheels, FuelType fuelType, int numberOfStops, ArrayList<String> stopNames) {
    super(brand, numberOfDoors, numberOfWheels, fuelType);
    this.numberOfStops = numberOfStops;
    this.stopNames = stopNames;
  }

  public void addAStopName(String stopName) {
    stopNames.add(stopName);
  }

  @Override
  public void makeSound() {
    System.out.println("Bus sound");
  }

  @Override
  public String toString() {
    return "Bus{" +
        "\nnumberOfStops=" + numberOfStops +
        "\nstopNames=" + stopNames +
        "\nbrand='" + brand + '\'' +
        "\nnumberOfDoors=" + numberOfDoors +
        "\nnumberOfWheels=" + numberOfWheels +
        "\nfuelType=" + fuelType +
        "\n}\n";
  }
}
