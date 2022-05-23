package Arv_polymorfi.undervisning;

public class Car extends Vehicle{

    //Field
    protected boolean hasSpoilers;
    protected String model;

    public Car(String brand, String color, int numberOfWheels, double hk, Fuel fuel, boolean hasSpoilers, String model) {
        super(brand, color, numberOfWheels, hk, fuel);
        this.hasSpoilers = hasSpoilers;
        this.model = model;
    }

    @Override
    public void makeSound() {
        System.out.println("Car sound HOOONK");;
    }

    public boolean hasSpoilers() {
        return hasSpoilers;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\nhasSpoilers=" + hasSpoilers +
                "\nmodel='" + model + '\'' +
                "\nbrand='" + brand + '\'' +
                "\ncolor='" + color + '\'' +
                "\nnumberOfWheels=" + numberOfWheels +
                "\nhk=" + hk +
                "\nfuel=" + fuel +
                "\n}\n";
    }
}
