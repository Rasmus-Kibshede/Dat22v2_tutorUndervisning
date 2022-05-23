package Arv_polymorfi.undervisning;

import java.util.ArrayList;

public class Bus extends Vehicle {

    //Field
    private ArrayList<String> stopNames;

    public Bus(String brand, String color, int numberOfWheels, double hk, Fuel fuel, ArrayList<String> stopNames) {
        super(brand, color, numberOfWheels, hk, fuel);
        this.stopNames = stopNames;
    }

    @Override
    public void makeSound() {
        System.out.println("Bus sound pisssht");
    }

    public ArrayList<String> getStopNames() {
        return stopNames;
    }

    public void addStop(String stop) {
        stopNames.add(stop);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "\nstopNames=" + stopNames +
                "\nbrand='" + brand + '\'' +
                "\ncolor='" + color + '\'' +
                "\nnumberOfWheels=" + numberOfWheels +
                "\nhk=" + hk +
                "\nfuel=" + fuel +
                "\n}\n";
    }
}
