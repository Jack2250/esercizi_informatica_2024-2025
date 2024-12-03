public class Pilota {
    private String nome;
    private String cognome;

    public Pilota(String nome, String cognome) throws Exception {
        if (nome.isEmpty() || cognome.isEmpty()) {
            throw new Exception("Stringa vuota");
        }
        this.nome = nome;
        this.cognome = cognome;
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

    @Override
    public String toString() {
        return "Nome:    " + nome + "    Cognome:    " + cognome;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pilota) {
            return this.nome.equals(((Pilota) obj).nome) && this.cognome.equals(((Pilota) obj).cognome);
        }
        return false;
    }

}