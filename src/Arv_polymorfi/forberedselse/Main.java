package Arv_polymorfi.forberedselse;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    ArrayList<String> stops = new ArrayList<>();
    stops.add("hanneVej");
    stops.add("peterVej");
    stops.add("jensVej");

    Bus bus = new Bus("VOLVO", 3, 6, FuelType.ELECTRIC, 23, stops);

    Truck truck = new Truck("Scania", 2, 6, FuelType.DIESEL, 1);

    Car car = new Car("Ford", 5, 4, FuelType.GASOLINE, "Mustang");

    Van van = new Van("Toyota", 4, 4, FuelType.DIESEL, "Hiace", 50);

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(bus);
    vehicles.add(car);
    vehicles.add(van);
    vehicles.add(truck);

    System.out.println(vehicles);

    car.drive();
    van.drive();


    for (Vehicle vehicle : vehicles) {

      //instanceof is a keyWord
      if (vehicle instanceof Car) {
        System.out.print("Brand: " + vehicle.getBrand());

        //Type casting also called downcasting
        System.out.println(" | Model: " + ((Car) vehicle).getModel());
      }
    }

  }
}
