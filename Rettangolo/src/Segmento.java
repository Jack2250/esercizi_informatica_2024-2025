public class Segmento {
    private Punto punto1;
    private Punto punto2;

    public Segmento(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public double lunghezza() {
        int x = punto2.getX() - punto1.getX();
        int y = punto2.getY() - punto1.getY();
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "Segmento " + "  Punto 1:  " + punto1 + "  Punto 2:  " + punto2 + " Lunghezza: " + lunghezza();
    }
}
