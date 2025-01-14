package backEnd;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensola {
    private int numeroLibri = 0;
    private int maxLibri;
    private ArrayList<Libro> mensola = new ArrayList<>();

    public Mensola(int numeroLibri) {
        this.maxLibri = numeroLibri;
    }

    public int getNumeroLibri() {
        return numeroLibri;
    }

    public ArrayList<Libro> getMensola() {
        return mensola;
    }

    public boolean checkSpace() throws Exception {
        boolean piena = true;
        if (numeroLibri == maxLibri)
            throw new Exception("La mensola è piena");
        else
            return false;
    }

    public void addLibro(Libro l) throws Exception {
        if (l != null && !mensola.contains(l)) {
            mensola.add(l);
            numeroLibri++;
        } else
            throw new Exception("Il libro è presente nella mensola");
    }

    public Libro findBook(String autore, String titolo) {
        for (Libro libro : mensola) {
            if (libro.getAutore().equalsIgnoreCase(autore) && libro.getTitolo().equalsIgnoreCase(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean removeBook(String autore, String titolo) {
        for (Libro libro : mensola) {
            if (libro.getAutore().equalsIgnoreCase(autore) && libro.getTitolo().equalsIgnoreCase(titolo)) {
                mensola.remove(libro);
                numeroLibri--;
                return true;
            }
        }
        return false;
    }

//    public void removeBook(Libro l) {
//        if (mensola.contains(l))
//            mensola.remove(l);
//    }

    public void setInto(Libro l, int posizione, Scanner tastiera) {
        System.out.println("In che posizione vuoi settare il libro: ");
        posizione = tastiera.nextInt();
        mensola.set(posizione, l);
    }

    public boolean containsBook(Libro l) {
        return mensola.contains(l);
    }

    public ArrayList<Libro> getVolumi() {
        ArrayList<Libro> nuovaMensola = new ArrayList<>();
        for (Libro libro : mensola) {
            nuovaMensola.add(new Libro(libro));
        }
        return nuovaMensola;
    }

    public boolean isEmpty() {
        return mensola.isEmpty();
    }

}
