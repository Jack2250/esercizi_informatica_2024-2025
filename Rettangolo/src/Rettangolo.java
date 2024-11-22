import java.util.ArrayList;
import java.util.List;

public class Rettangolo {
    private Punto altoSinistra;
    private Punto bassoDestra;
    private ArrayList<Segmento> segmenti;

    public Rettangolo(Punto altoSinistra, int base, int altezza) throws Exception {
        this.altoSinistra = altoSinistra;

        // Calcola il punto in basso a destra
        this.bassoDestra = new Punto(altoSinistra.getX() + base, altoSinistra.getY() - altezza);

        if (!primoQuadrante()) {
            throw new Exception();
        }

        this.segmenti = (ArrayList<Segmento>) calcolaSegmenti();
    }

    private boolean primoQuadrante() {
        if (altoSinistra.getX() > 0 && altoSinistra.getY() > 0 && bassoDestra.getX() > 0 && bassoDestra.getY() > 0)
            return true;

        return false;
    }

    private List<Segmento> calcolaSegmenti() {
        List<Segmento> segmenti = new ArrayList<>();

        Punto altoDestra = new Punto(bassoDestra.getX(), altoSinistra.getY());
        Punto bassoSinistra = new Punto(altoSinistra.getX(), bassoDestra.getY());

        segmenti.add(new Segmento(altoSinistra, altoDestra));       // Lato superiore
        segmenti.add(new Segmento(bassoSinistra, bassoDestra));   // Lato destro
        segmenti.add(new Segmento(bassoDestra, altoDestra));      // Lato inferiore
        segmenti.add(new Segmento(bassoSinistra, altoSinistra));     // Lato sinistro

        return segmenti;
    }

    public ArrayList<Segmento> getSegmenti() {
        return segmenti;
    }

    @Override
    public String toString() {
        return "Rettangolo" + "   Punto in alto a sinistra:  " + altoSinistra + ", Punto in basso a destra: " + bassoDestra + "  Segmenti:  " + segmenti;
    }
}
