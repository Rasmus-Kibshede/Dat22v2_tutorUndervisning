package Arv_polymorfi.undervisning;

public class Truck extends Vehicle{

    //Field
    private boolean hasCargo;

    public Truck(String brand, String color, int numberOfWheels, double hk, Fuel fuel, boolean hasCargo) {
        super(brand, color, numberOfWheels, hk, fuel);
        this.hasCargo = hasCargo;
    }

    @Override
    public void makeSound() {
        System.out.println("Truck sound");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "\nhasCargo=" + hasCargo +
                "\nbrand='" + brand + '\'' +
                "\ncolor='" + color + '\'' +
                "\nnumberOfWheels=" + numberOfWheels +
                "\nhk=" + hk +
                "\nfuel=" + fuel +
                "\n}\n";
    }
}
