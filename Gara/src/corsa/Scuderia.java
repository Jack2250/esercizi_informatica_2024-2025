package corsa;

public class Scuderia implements Comparable<Scuderia> {

    private String nome;
    private Pilota nPilota;
    private Integer tempoGiro;
    private int nAuto;

    // Costruttore per inizializzare nome, pilota e numero di auto
    public Scuderia(String nome, Pilota nPilota, int nAuto) {
        this.nome = nome;
        this.nPilota = nPilota;
        this.nAuto = nAuto;
    }

    public String getNome() {
        return nome;
    }

    public Pilota getnPilota() {
        return nPilota;
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    public void setTempoGiro(int tempoGiro) {
        this.tempoGiro = tempoGiro;
    }

    public int getnAuto() {
        return nAuto;
    }

    @Override
    public String toString() {
        return String.format("Nome Scuderia: %s, Pilota nome: %s Pilota cognome: %s Tempo giro: %d Numero auto: %d",nome, nPilota.getNome(), nPilota.getCognome(), tempoGiro, nAuto);
    }

    // Confronto delle scuderie basato sul tempo di giro
    @Override
    public int compareTo(Scuderia s) {
        return this.tempoGiro.compareTo(s.getTempoGiro());
    }
}
