public class Veicolo {
    private String marca;
    private String modello;
    private double prezzo;

    public Veicolo(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Veicolo) {
            return ((Veicolo) obj).marca.equals(this.marca) && ((Veicolo) obj).modello.equals(this.modello);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f", marca, modello, prezzo);
    }
}