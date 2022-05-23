package interface_arrays_loops.forberedelse;

import java.util.Comparator;

public class AnimalAgeComperator implements Comparator<Animal> {
  @Override
  public int compare(Animal o1, Animal o2) {
    return Integer.compare(o1.age, o2.age);
  }
}
