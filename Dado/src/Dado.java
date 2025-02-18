import java.util.Random;

public class Dado {
    private int nFacce;
    private int valFaccia;
    private Random valLancio;

    public Dado(int nFacce) {
        this.nFacce = nFacce;
    }

    public void setnFacce(int nFacce) {
        this.nFacce = nFacce;
    }

    public void setValFaccia(int valFaccia) {
        this.valFaccia = valFaccia;
    }


    public int getnFacce() {
        return nFacce;
    }

    public int getValFaccia() {
        return valFaccia;
    }

    public Random getValLancio() {
        return valLancio;
    }

    public void lancia() {
        valLancio = new Random();
        valFaccia = valLancio.nextInt(1, nFacce);
    }
}