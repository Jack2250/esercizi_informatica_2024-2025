import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Creazione di un ArrayList di Integer
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(15);  // add
        numeri.add(20);
        numeri.add(30);

        // Creazione di alcuni oggetti Libro
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry");

        // Creazione di un ArrayList di Libro
        ArrayList<Libro> libri = new ArrayList<>();
        libri.add(libro1);  // add
        libri.add(libro2);
        libri.add(libro3);


        System.out.println("Lista iniziale: " + numeri);

        numeri.remove(Integer.valueOf(20));  // remove
        System.out.println("Lista dopo la rimozione del 20: " + numeri);

        numeri.forEach(num -> System.out.println("Elemento: " + num));  // forEach

        numeri.add(0, 5); // addFirst
        System.out.println("Lista dopo aggiunta all'inizio: " + numeri);

        numeri.add(numeri.size(), 35); // addLast
        System.out.println("Lista dopo aggiunta alla fine: " + numeri);

        System.out.println("Primo elemento: " + numeri.get(0));  // getFirst
        System.out.println("Ultimo elemento: " + numeri.get(numeri.size() - 1));  // getLast

        System.out.println("L'indice del 15: " + numeri.indexOf(15));  // indexOf
        System.out.println("Contiene il numero 5? " + numeri.contains(5));  // contains

        System.out.println("Ultima posizione del 30: " + numeri.lastIndexOf(30));  // lastIndexOf


        numeri.remove(0);  // removeFirst

        numeri.remove(numeri.size() - 1);  // removeLast
        System.out.println("Lista dopo rimozione primo e ultimo elemento: " + numeri);

        // Cambiare il valore di un elemento
        numeri.set(0, 100);  // set
        System.out.println("Lista dopo aver settato il primo elemento a 100: " + numeri);

        // Creare una copia per il confronto
        ArrayList<Integer> copiaNumeri = new ArrayList<>(numeri);
        System.out.println("Le due liste sono uguali? " + numeri.equals(copiaNumeri));  // equals

        System.out.println("La lista è vuota? " + numeri.isEmpty());  // isEmpty

        numeri.clear();  // clear
        System.out.println("Lista dopo clear: " + numeri);

        System.out.println("Dimensione della lista copia: " + copiaNumeri.size());  // size

        // Invertire l'ordine della lista
        Collections.reverse(copiaNumeri);  // reversed
        System.out.println("Lista copiata in ordine inverso: " + copiaNumeri);  // reversed


        System.out.println("Lista di libri: " + libri);

        libri.remove(libro2);  // remove
        System.out.println("Dopo la rimozione del secondo libro: " + libri);

        libri.forEach(libro -> System.out.println("Libro: " + libro));  // forEach

        // Aggiungere un libro all'inizio
        libri.add(0, new Libro("Harry Potter", "J.K. Rowling"));  // addFirst
        // Aggiungere un libro alla fine
        libri.add(libri.size(), new Libro("Moby Dick", "Herman Melville"));  // addLast

        System.out.println("Lista con primo e ultimo libro aggiunti: " + libri);

        System.out.println("Primo libro: " + libri.get(0));  // getFirst
        System.out.println("Ultimo libro: " + libri.get(libri.size() - 1));  // getLast

        System.out.println("Indice del Piccolo Principe: " + libri.indexOf(libro3));  // indexOf
        System.out.println("Contiene Harry Potter? " + libri.contains(new Libro("Harry Potter", "J.K. Rowling")));  // contains

        // Rimuovere il primo libro
        libri.remove(0);  // removeFirst
        // Rimuovere l'ultimo libro
        libri.remove(libri.size() - 1);  // removeLast
        System.out.println("Lista dopo la rimozione del primo e ultimo libro: " + libri);

        // Cambia il primo libro della lista
        libri.set(0, new Libro("Orgoglio e Pregiudizio", "Jane Austen"));  // set
        System.out.println("Lista dopo aver cambiato il primo libro: " + libri);

        // Crea una copia della lista
        ArrayList<Libro> copiaLibri = new ArrayList<>(libri);
        System.out.println("Le liste di libri sono uguali? " + libri.equals(copiaLibri));  // equals

        System.out.println("La lista di libri è vuota? " + libri.isEmpty());  // isEmpty

        libri.clear();  // clear
        System.out.println("Lista dopo clear: " + libri);

        copiaLibri.add(new Libro("Dracula", "Bram Stoker"));
        System.out.println("Dimensione della lista copia: " + copiaLibri.size());  // size

        // Inverte l'ordine della lista
        Collections.reverse(copiaLibri);  // reversed
        System.out.println("Lista copiata in ordine inverso: " + copiaLibri);  // reversed
    }
}