import java.util.Random;

public class Dado {
    private int nFacce;
    private int valFaccia;
    private Random random;

    public Dado(int nFacce) {
        this.nFacce = nFacce;
        this.random = new Random();
    }

    public int getValFaccia() {
        return valFaccia;
    }

    public void lancia() {
        valFaccia = random.nextInt(nFacce) + 1;
    }

    public void reset() {
        valFaccia = 0;
    }
}