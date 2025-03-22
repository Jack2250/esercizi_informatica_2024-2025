package backend;

public abstract class ProdottoElettronico {
    private String codiceProdotto;
    private String marca;
    private double prezzo;

    public ProdottoElettronico(String codiceProdotto, String marca, double prezzo) {
        this.codiceProdotto = codiceProdotto;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    protected ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Smartphone) {
            return this.codiceProdotto.equals(((Smartphone) o).getCodiceProdotto());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Codice: %s Marca: %s Prezzo: %.2f", codiceProdotto, marca, prezzo);
    }
}