import java.util.ArrayList;

public class Istituto {
    private ArrayList<Dipendente> scuola;

    public Istituto() {
        scuola = new ArrayList<>();
    }

    public ArrayList<Dipendente> getScuola() {
        return scuola;
    }

    public void setScuola(ArrayList<Dipendente> scuola) {
        this.scuola = scuola;
    }

    public void addDipendente(Dipendente d) throws Exception {
        if (!scuola.contains(d)) {
            scuola.add(d);
        } else {
            throw new Exception("Questo dipendetne è gia presente nella scuola");
        }
    }

    public void stampaIncentivi() {
        for (Dipendente dipendente : scuola) {
            System.out.println(dipendente.getIncentivo());
        }
    }

}