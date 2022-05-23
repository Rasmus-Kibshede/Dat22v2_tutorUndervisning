package OOP.undervisning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {


        Film blade = new Film("Blade", 1998);
        Film batman = new Film("Batman");
        Film starwars = new Film("Starwars", 1977, new Producer("Gary"));

        ArrayList<Film> film = new ArrayList<>();
        film.add(starwars);
        film.add(blade);
        film.add(batman);

        blade.setProducer(new Producer("hej"));

        Collections.sort(film);

        System.out.println(film);




        Tekst tekst = new Tekst();

        tekst.tilføj("a");
        tekst.tilføj("a");
        tekst.tilføj("b");
        tekst.tilføj("b");
        tekst.tilføj("d");

        System.out.println(tekst.findAntalUnikke1());




    }


}
