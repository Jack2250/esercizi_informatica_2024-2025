public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 10;
        this.y = 10;
    }

    /*public Punto(int x, int y){ //Costruttore
        this.x = x;
        this.y = y;
    }*/
    public Punto(int x, int y){
        setX(x);
        setY(y);
    }
    
    public Punto (int x){
        this(x,10);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
