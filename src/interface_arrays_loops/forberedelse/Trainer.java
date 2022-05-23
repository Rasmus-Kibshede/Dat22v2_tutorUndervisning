package interface_arrays_loops.forberedelse;

import java.util.ArrayList;

public class Trainer {

  private String name;
  private int age;

  private ArrayList<Animal> animals = new ArrayList<>();

  public Trainer(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public ArrayList<Animal> getAnimals() {
    return animals;
  }
}
