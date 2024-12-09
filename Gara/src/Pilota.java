public class Pilota {
    private String nome;
    private String cognome;
    private String nazionalita;

    public Pilota(String nome, String cognome, String nazionalita) throws Exception {

        if (isValue(nome) && isValue(cognome) && isValue(nazionalita)) {
            this.nome = nome;
            this.cognome = cognome;
            this.nazionalita = nazionalita;
        } else {
            throw new Exception("Invalid data");
        }

    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    private boolean isValue(String s) {
        return s != null && !s.isEmpty();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s, Nazionalità: %s", nome, cognome, nazionalita);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pilota) {
            return this.nome.equals(((Pilota) obj).nome) && this.cognome.equals(((Pilota) obj).cognome) && this.nazionalita.equals(((Pilota) obj).nazionalita);
        } else {
            throw new ClassCastException("L'oggetto non è di tipo pilota");
        }
    }
}