package Arv_polymorfi.undervisning;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "Red", 4, 160.5, Fuel.HYBRID, true, "Mondeo");


        ArrayList<String> busStops = new ArrayList<>();
        busStops.add("Hans vej");
        busStops.add("Hendes vej");

        Bus bus = new Bus("scania", "Yellow", 6, 1000, Fuel.ELECTRIC, busStops);

        Truck truck = new Truck("Vovlo", "Blue", 8, 1500.50, Fuel.DIESEL, true);

        Van van = new Van("Toyota", "Pink", 4, 10.3, Fuel.GASOLINE, false, "Hiace", 50);

        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(car);
        list.add(bus);
        list.add(truck);
        list.add(van);
    }
}
