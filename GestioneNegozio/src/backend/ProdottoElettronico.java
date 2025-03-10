package backend;

import java.util.Objects;

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

    @Override
    public String toString() {
        return String.format("Codice prodotto %s, Marca %s, Prezzo %f", codiceProdotto, marca, prezzo);
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
    protected ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }
}