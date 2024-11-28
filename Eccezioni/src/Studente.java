public class Studente {
    private String nome, cognome;
    private int media, eta;

    public Studente(String nome, String cognome, int media, int eta) throws Exception {
        if (eta < 14) {
            throw new Exception("L'età non può essere minore di 14 anni");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
        this.eta = eta;
    }

    public Studente(String nome, String cognome, int eta) throws Exception {
        this(nome, cognome, 0, eta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) throws Exception {
        if (eta < 14) {
            throw new Exception("L'età non può essere minore di 14 anni");
        }
        this.eta = eta;
    }

}