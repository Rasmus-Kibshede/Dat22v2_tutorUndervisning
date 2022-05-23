package eksamen.øvelse6.sammen;

public class Bil {
    private Trailer trailer;
    private int vægt;

    public Bil(Trailer trailer, int vægt) {
        this.vægt = vægt;
        setTrailer(trailer);
    }

    public void setTrailer(Trailer trailer) {
        if ((trailer.getVægt() + vægt) < 3500)
            this.trailer = trailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public int getTotalVægt() {
        if (trailer != null) {
            return vægt + trailer.getVægt();
        }
        return vægt;
    }
}
