import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sfera s1 = new Sfera(3, 5);
        Cubo c1 = new Cubo(4, 5);
        GalleriaDeiSolidi g = new GalleriaDeiSolidi();
        try {
            g.inserisciSolido(s1);
            g.inserisciSolido(c1);
            ArrayList<Solido> listaRitornata;
            listaRitornata = g.getLista();
            listaRitornata.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}