package comparable_comparator.myVersion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {

        SuperComperator superComperator = new SuperComperator("brand", "ASC");

        Car car1 = new Car("Testla", "brand", FuelType.DIESEL, 2);
        Car car2 = new Car("Ford", "mondeo", FuelType.GASOLINE, 1);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);

        System.out.println(cars);

        System.out.println("-----------------------------");

        superComperator.setSortOn("age");
        //superComperator.setSortDirection("TOGGLE");
        //superComperator.setSortDirection("ASC");
        //superComperator.setSortDirection("DESC");

        cars.sort(superComperator);

        System.out.println(cars);
    }
}
