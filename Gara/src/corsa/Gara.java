package corsa;

import java.util.ArrayList;

public class Gara {

    private String nome;
    private String nazione;
    private ArrayList<Scuderia> griglia = new ArrayList<>(); // Elenco delle scuderie partecipa

    public Gara(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public String getNazione() {
        return nazione;
    }

    public ArrayList<Scuderia> getGriglia() {
        return griglia;
    }

    public void setGriglia(ArrayList<Scuderia> griglia) {
        this.griglia = griglia;
    }

    @Override
    public String toString() {
        return String.format("Nome gara: %s\n Nazione gara: %s", nome, nazione);
    }
}
