package Arv_polymorfi.forberedselse;

public class Car extends Vehicle {

  private String model;

  public Car(String brand, int numberOfDoors, int numberOfWheels, FuelType fuelType, String model) {
    super(brand, numberOfDoors, numberOfWheels, fuelType);
    this.model = model;
  }

  @Override
  public void makeSound() {
    System.out.println("Car sound");
  }

  @Override
  public String toString() {
    return "Car{" +
        "\nmodel='" + model + '\'' +
        "\nbrand='" + brand + '\'' +
        "\nnumberOfDoors=" + numberOfDoors +
        "\nnumberOfWheels=" + numberOfWheels +
        "\nfuelType=" + fuelType +
        "\n}\n";
  }

  public void drive(){
    System.out.println("Driving car now");
  }

  public String getModel() {
    return model;
  }
}
