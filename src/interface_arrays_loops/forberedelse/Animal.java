package interface_arrays_loops.forberedelse;

public abstract class Animal implements Comparable<Animal> {

  protected String name;
  protected int age;
  protected String race;
  protected String color;

  public Animal(String name, int age, String race, String color) {
    this.name = name;
    this.age = age;
    this.race = race;
    this.color = color;
  }

  @Override
  public int compareTo(Animal o) {
    return name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return "Animal{" +
        "\name='" + name + '\'' +
        "\nage=" + age +
        "\nrace='" + race + '\'' +
        "\ncolor='" + color + '\'' +
        "\n}\n";
  }
}
