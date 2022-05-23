package interface_arrays_loops.undervisning;

import java.util.ArrayList;

public class Main {

    private static String[] strings = {"Hello", "World"};

    public static void main(String[] args) {

        Cat cat = new Cat("Mette", 14);

        Dog dog = new Dog("Hans", 2);

        Movement movement = new Dog("test", 1);

        ArrayList<Movement> list = new ArrayList();
        list.add(cat);
        list.add(dog);

        for (Movement m : list) {
            m.run();
            m.stop();
        }

        movement.run();
    }

    public static void replaceWord(String stringFind, String string) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(stringFind)) {
                strings[i] = string;
            }
        }

    }
}
