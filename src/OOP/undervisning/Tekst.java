package OOP.undervisning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tekst {
    private ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String tekstLinje) {
        this.tekstLinjer.add(tekstLinje);
    }

    /*public int findAntalUnikke() {
        ArrayList<String> unikkeStringe = new ArrayList<>();

        for (int i = 0; i < tekstLinjer.size(); i++) {

            if (!unikkeStringe.contains(tekstLinjer.get(i))) {
                unikkeStringe.add(tekstLinjer.get(i));
            }
        }

        return unikkeStringe.size();
    }
*/
    public int findAntalUnikke() {
        ArrayList<String> unikkeStringe = new ArrayList<>();

        for (String s : tekstLinjer) {
            if (unikkeStringe.contains(s)) {
                unikkeStringe.remove(s);
            } else {
                unikkeStringe.add(s);
            }
        }

        return unikkeStringe.size();
    }

    public int findAntalUnikke1() {
        ArrayList<String> unikkeStringe = new ArrayList<>();

        for (String s : tekstLinjer) {
            if (!unikkeStringe.contains(s)) {
                unikkeStringe.add(s);
            }
        }

        return unikkeStringe.size();
    }

    public int findAntalUnikke2() {
        Set<String> s = new HashSet<>(tekstLinjer);
        return s.size();
    }
}
