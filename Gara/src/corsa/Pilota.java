package corsa;

public class Pilota {

    private String nome;  // Nome del pilota
    private String cognome;  // Cognome del pilota
    private String nazionalita;  // Nazionalità del pilota

    // Costruttore che inizializza nome e cognome del pilota
    public Pilota(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    // Metodo per restituire una rappresentazione del pilota sotto forma di stringa
    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s, Nazionalità: %s", nome, cognome, nazionalita);
    }

    // Metodo equals per confrontare due oggetti Pilota
    @Override
    public boolean equals(Object obj) {
        // Verifica che l'oggetto sia un'istanza di Pilota
        if (!(obj instanceof Pilota)) {
            return false;
        } else {
            Pilota p = (Pilota) obj;
            // Confronta nome, cognome e nazionalità per determinare uguaglianza
            return this.nome.equals(p.nome) && this.cognome.equals(p.cognome) && this.nazionalita.equals(p.nazionalita);
        }
    }
}

