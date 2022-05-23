package interface_arrays_loops.forberedelse;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {

    Dog dog = new Dog("Hans", 1, "Dog", "White");
    Cat cat = new Cat("Mette", 3, "Cat", "Blue");

    Trainer trainer = new Trainer("Torben", 55);
    trainer.addAnimal(dog);
    trainer.addAnimal(cat);

    /*for (Animal animal : trainer.getAnimals()) {
      System.out.println(animal.race);
      ((Movement)animal).go();
      ((Movement)animal).jump();
      ((Movement)animal).run();
      ((Movement)animal).spin();
      System.out.println();
    }*/

    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(cat);
    animals.add(dog);

    System.out.println("-------------------- before --------------------");
    for (Animal animal : animals) {
      System.out.println(animal);
    }

    AnimalAgeComperator animalAgeComperator = new AnimalAgeComperator();

    //Collections.sort(animals, animalAgeComperator);
    animals.sort(animalAgeComperator);

    System.out.println("-------------------- After --------------------");
    for (Animal animal : animals) {
      System.out.println(animal);
    }
  }
}
