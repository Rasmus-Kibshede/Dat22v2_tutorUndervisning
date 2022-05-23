package eksamen.øvelse6;

public class Bil {
    private Trailer trailer;
    private Double vægt;
    private Boolean hasTrailer;


    public Bil(Trailer trailer, Double vægt) {

        this.vægt = vægt;

        if ((vægt + trailer.getVægt()) <= 3500) {
            this.trailer = trailer;
            this.hasTrailer = true;
        } else {
            this.hasTrailer = false;
        }
    }


    public double getTotalVægt() {
        if (trailer != null)
            return vægt + trailer.getVægt();
        return vægt;
    }

    public Boolean getHasTrailer() {
        return hasTrailer;
    }

    public Trailer getTrailer() {
        return trailer;
    }
}
