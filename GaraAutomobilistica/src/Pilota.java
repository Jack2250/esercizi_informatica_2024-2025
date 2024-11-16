public class Pilota {
    private String nome;
    private String cognome;
    private String nazionalita;
    private int eta;

    public Pilota(String nome, String cognome, String nazionalita, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Nome:  " + nome + "  Cognome:  " + cognome + "  Nazionalità:  " + nazionalita + "  Età:  " + eta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Pilota pilota = (Pilota) obj;
        return eta == pilota.eta && nome.equals(pilota.nome) && cognome.equals(pilota.cognome);

    }
}