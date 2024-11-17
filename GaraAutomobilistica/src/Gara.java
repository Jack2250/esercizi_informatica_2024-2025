import java.util.ArrayList;

public class Gara {
    private String nomeGara;
    private Pilota risultato;
    private ArrayList<Auto> auto;

    public Gara(String nomeGara, ArrayList<Auto> auto) {
        this.nomeGara = nomeGara;
        this.auto = auto;
    }

    public Pilota corriGara() {
        if (auto == null || auto.isEmpty())
            return null;

        Auto vincitrice = auto.get(0); //Imposto la prima auto come vincitrice come punto di partenza per poi aggiornarla in seguito
        for (Auto a : auto) {
            if (a.getCilindrata() > vincitrice.getCilindrata()) {
                vincitrice = a; //Aggiorna se trova un'auto con cilindrata maggiore
            }
        }

        risultato = vincitrice.getPilota();
        return risultato;

    }

    public Pilota getRisultato() {
        return risultato;
    }
}