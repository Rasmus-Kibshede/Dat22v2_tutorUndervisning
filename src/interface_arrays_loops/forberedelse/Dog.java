package interface_arrays_loops.forberedelse;

public class Dog extends Animal implements Movement{


  public Dog(String name, int age, String race, String color) {
    super(name, age, race, color);
  }

  @Override
  public void run() {
    System.out.println(name + " runs");
  }

  @Override
  public void go() {
    System.out.println(name + " goes");
  }

  @Override
  public void spin() {
    System.out.println(name + " spins around");
  }

  @Override
  public void jump() {
    System.out.println(name + " jumps");
  }
}
