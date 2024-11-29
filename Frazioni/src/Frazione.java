public class Frazione {
    private double numeratore;
    private double denominatore;

    public Frazione(double numeratore, double denominatore) throws Exception {
        this.numeratore = numeratore;
        if (denominatore == 0) {
            throw new Exception("Il denominatore deve essere diverso da 0");
        }
        this.denominatore = denominatore;
    }

    public String sommaFrazioni(Frazione frazione1, Frazione frazione2) { //Sbagliato
        double numeratore = frazione1.getNumeratore() + frazione2.getNumeratore();
        double denominatore = frazione1.getDenominatore() + frazione2.getDenominatore();
        return numeratore + " / " + denominatore;
    }

    public double sommaFrazioni2(Frazione frazione1, Frazione frazione2) {
        return frazione1.getFrazione() + frazione2.getFrazione();
    }

    private double getFrazione() {
        return numeratore / denominatore;
    }

    public double getNumeratore() {
        return numeratore;
    }

    public double getDenominatore() {
        return denominatore;
    }

    @Override
    public String toString() {
        return "Numeratore:   " + numeratore + "   Denominatore:     " + denominatore + "   Frazione: " + getFrazione();
    }
}
