package interface_arrays_loops.forberedelse;

public class Cat extends Animal implements Movement{
  public Cat(String name, int age, String race, String color) {
    super(name, age, race, color);
  }

  @Override
  public void run() {
    System.out.println(name + " runs");
  }

  @Override
  public void go() {
    System.out.println(name + " doesn't listens to you");
  }

  @Override
  public void spin() {
    System.out.println(name + " goes to sleep");
  }

  @Override
  public void jump() {
    System.out.println(name + " jumps");
  }
}
