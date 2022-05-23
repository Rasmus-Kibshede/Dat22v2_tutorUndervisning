package eksamen.øvelse6.sammen;

public class Main {
    public static void main(String[] args) {

        Trailer trailer = new Trailer(1000);
        Bil bil = new Bil(trailer, 3000);

        System.out.println(bil.getTotalVægt());
        System.out.println(bil.getTrailer());

    }
}
