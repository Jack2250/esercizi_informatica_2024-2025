import java.util.ArrayList;

public class Gara {
    private String nomeGara;
    private Pilota risultato;
    private ArrayList<Auto> auto = new ArrayList<>();

    public Gara(String nomeGara, Pilota risultato, ArrayList<Auto> auto) {
        this.nomeGara = nomeGara;
        this.risultato = risultato;
        this.auto = auto;
    }

    public Pilota corriGara(String nomeGara, ArrayList<Auto> auto) {

        //DA FINIRE
        return risultato;
    }
}