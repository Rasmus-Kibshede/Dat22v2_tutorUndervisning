package Arv_polymorfi.forberedselse;

public class Van extends Car{

  private int backSpace;

  public Van(String brand, int numberOfDoors, int numberOfWheels, FuelType fuelType, String model, int backSpace) {
    super(brand, numberOfDoors, numberOfWheels, fuelType, model);
    this.backSpace = backSpace;
  }

  @Override
  public String toString() {
    return "Van{" +
        "\nbackSpace=" + backSpace +
        "\nbrand='" + brand + '\'' +
        "\nnumberOfDoors=" + numberOfDoors +
        "\nnumberOfWheels=" + numberOfWheels +
        "\nfuelType=" + fuelType +
        "\n}\n";
  }

  @Override
  public void drive(){
    System.out.println("Driving van now");
  }
}
