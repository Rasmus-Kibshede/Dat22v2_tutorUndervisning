package Filer_Exceptions.forberedelse;

public class Animal {

  private String name;
  private String race;
  private int age;

  public Animal(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getRace() {
    return race;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "\nname: " + name +
        " | race: " + race + '\'' +
        " | age: " + age + "\n";
  }
}
