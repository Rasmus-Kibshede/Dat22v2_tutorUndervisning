package interface_arrays_loops.undervisning;

public abstract class Animal {

    //Field
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "\nname='" + name + '\'' +
                "\nage=" + age +
                "\n}\n";
    }
}
