public class Automobile extends Veicolo {
    private int nPorte;

    public Automobile(String marca, String modello, double prezzo, int nPorte) {
        super(marca, modello, prezzo);
        this.nPorte = nPorte;
    }

    public int getnPorte() {
        return nPorte;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%d", nPorte);
    }
}