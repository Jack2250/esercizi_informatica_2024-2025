package backend;

public abstract class Libro {
    private String nome;
    private String descrizione;
    private String autore;
    private String ISBN;
    private double prezzo;
    private int quantita;

    public Libro(String nome, String descrizione, String autore, String sbm, double prezzo, int quantita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.ISBN = sbm;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getAutore() {
        return autore;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    @Override
    protected Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Libro) {
            return this.nome.equals(((Libro) o).getNome()) && this.autore.equals(((Libro) o).getAutore());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s Descrizione: %s Autore: %s ISBN: %s Prezzo: %.2f Quantità: %d",nome,descrizione,autore,ISBN,prezzo,quantita);
    }
}