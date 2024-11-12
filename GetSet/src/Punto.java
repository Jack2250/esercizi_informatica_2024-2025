public class Punto {
    private int x;
    private int y;
    private final int MAX_X = 20;
    private final int MAX_Y = 20;

    public Punto() {
        this.x = 10;
        this.y = 10;
    }

    /*public Punto(int x, int y){ //Costruttore
        this.x = x;
        this.y = y;
    }*/
    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public Punto(int x) {
        this(x, 10);
    }


    public void setX(int x) throws Exception {
        if (x > MAX_X) {
            throw new Exception("Ordinata out of range X");
        } else {
            this.x = x;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Exception {
        if (y > MAX_Y) {
            throw new Exception("Ordinata out of range Y");
        } else {
            this.y = y;
        }

    }

    public String cercaQuadrante() {
        if (x > 0 && y > 0) {
            return "Primo quadrante";
        } else if (x > 0 && y < 0) {
            return "Quarto quadrante";
        } else if (x < 0 && y > 0) {
            return "Secondo quadrante";
        } else if (x < 0 && y < 0) {
            return "Terzo quadrante";
        } else {
            return "Il punto si trova negli assi";
        }
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y;
    }
}