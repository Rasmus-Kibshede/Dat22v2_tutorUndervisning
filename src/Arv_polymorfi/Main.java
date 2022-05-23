package Arv_polymorfi;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Airplane airplane = new Airplane();
    airplane.fly();

    Helli helli = new Helli();


    ArrayList<Fly> list = new ArrayList<>();
    list.add(airplane);
    list.add(helli);


  }
}
