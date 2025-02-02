public class PcPortatili {
    private double peso;
    private double altezza;
    private double larghezza;
    private double profondita;
    private double dimensioneVideo;

    public PcPortatili(double peso, double altezza, double larghezza, double profondita) {
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.dimensioneVideo = dimensioneVideo;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensioneVideo() {
        return dimensioneVideo;
    }

    public double getProfondita() {
        return profondita;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(peso), altezza, profondita, larghezza, dimensioneVideo);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PcPortatili that)) return false;
        return Double.compare(peso, that.peso) == 0 && Double.compare(dimensioneVideo, that.dimensioneVideo) == 0;
    }
}