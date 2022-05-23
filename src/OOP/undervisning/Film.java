package OOP.undervisning;

import java.time.LocalDate;
import java.time.LocalTime;

public class Film implements Comparable<Film> {
    private String filmTitel;
    private int udgivelsesÅr;
    private Producer producer;

    public Film(String titel, int år) {
        filmTitel = titel;
        udgivelsesÅr = år;
    }

    public Film(String titel, int år, Producer producer) {
        filmTitel = titel;
        udgivelsesÅr = år;
    }

    public Film(String titel) {
        filmTitel = titel;
        udgivelsesÅr = LocalDate.now().getYear();
    }

    public String getFilmTitel() {
        return filmTitel;
    }


    public void setProducer(Producer producer) {
        this.producer = producer;
    }


    public String toString() {
        if (producer != null) {
            return filmTitel + " " + udgivelsesÅr + " " + producer.getName();
        }

        return filmTitel + " " + udgivelsesÅr;
    }

    public int compareTo(Film o) {
        return this.filmTitel.compareTo(o.filmTitel);
    }
}
