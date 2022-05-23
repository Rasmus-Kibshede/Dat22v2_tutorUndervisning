package comparable_comparator.undervisning;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {

        Car car1 = new Car("Testla", "brand", FuelType.DIESEL, 2);
        Car car2 = new Car("Ford", "mondeo", FuelType.GASOLINE, 1);


        /*Car[] cars = new Car[2];
        cars[0] = car1;
        cars[1] = car2;

        for (Car car : cars) {
            System.out.println(car);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
*/

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);

        System.out.println(cars);

        System.out.println("-----------------------------");

        cars.sort(new AgeSortComperator());

        System.out.println(cars);
    }


}
