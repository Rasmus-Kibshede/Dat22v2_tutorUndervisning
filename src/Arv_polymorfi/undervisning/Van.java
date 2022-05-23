package Arv_polymorfi.undervisning;

public class Van extends Car {

    //Field
    private int backSpace;

    public Van(String brand, String color, int numberOfWheels, double hk, Fuel fuel, boolean hasSpoilers, String model, int backSpace) {
        super(brand, color, numberOfWheels, hk, fuel, hasSpoilers, model);
        this.backSpace = backSpace;
    }

    public int getBackSpace() {
        return backSpace;
    }

    @Override
    public String toString() {
        return "Van{" +
                "\nhasSpoilers=" + hasSpoilers +
                "\nmodel='" + model + '\'' +
                "\nbackSpace=" + backSpace +
                "\nbrand='" + brand + '\'' +
                "\ncolor='" + color + '\'' +
                "\nnumberOfWheels=" + numberOfWheels +
                "\nhk=" + hk +
                "\nfuel=" + fuel +
                "\n}\n";
    }
}
