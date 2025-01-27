public class Dipendente {
    private final String nominativo;
    private final char genere;
    //protected String indirizzo; VIOLA L'INCAPSULAMENTO
    private String indirizzo;
    private final double incentivo = 0.50;

    public Dipendente(String nominativo, char genere, String indirizzo) {
        this.nominativo = nominativo;
        this.genere = genere;
        this.indirizzo = indirizzo;
    }

    public String getNominativo() {
        return nominativo;
    }

    public char getGenere() {
        return genere;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return String.format("%s - %c - %s - %.2f", nominativo, genere, indirizzo, incentivo);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dipendente) {
            return ((Dipendente) obj).nominativo.equals(this.nominativo);
        }
        return false;
    }
}
