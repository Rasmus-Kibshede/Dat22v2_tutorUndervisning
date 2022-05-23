package Arv_polymorfi;

public class Airplane implements Fly{

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void land() {
        System.out.println("Land");
    }
}
