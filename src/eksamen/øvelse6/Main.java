package eksamen.øvelse6;

public class Main {
    public static void main(String[] args) {

        Trailer trailer = new Trailer(1500.0);
        Bil bil = new Bil(trailer, 2000.0);

        System.out.println("Total vægten: " + bil.getTotalVægt());

        System.out.println("Har bilen trailer: " + bil.getHasTrailer());


    }
}
