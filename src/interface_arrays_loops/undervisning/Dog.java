package interface_arrays_loops.undervisning;

public class Dog extends Animal implements Movement{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(name + " walks");
    }

    @Override
    public void stop() {
        System.out.println(name + " Stops");
    }

    @Override
    public void run() {
        System.out.println(name + " runs");
    }
}
