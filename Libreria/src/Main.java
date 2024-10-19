import Mensola.Libro;
import frontScreen.FrontEnd;
import static utility.Tools.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 2;
        int contaLibri = 0;
        Libro libro = new Libro();
        Libro[] mensola = new Libro[MAXLIBRI];
        String[] opzioni = {"Menu", "1-Inserimento", "2-Visualizza", "3-Uscita"};
        boolean esci = true;
        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    for (int i = 0; i < MAXLIBRI; i++) {
                        System.out.println("Inserisci i dettagli del libro #" + (i + 1) + ":");
                        System.out.println("Inserisci autore:");
                        libro.autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo:");
                        libro.titolo = tastiera.nextLine();

                        // Verifica se il libro esiste già
                        if (ricerca(contaLibri, mensola,libro)) {
                            System.out.println("Il libro con autore " + libro.autore + " e titolo " + libro.titolo + " è già presente. Inserimento non consentito.");
                        } else {
                            mensola[i] = FrontEnd.LeggiLibro(tastiera, libro.autore, libro.titolo); // Passo autore e titolo per evitare di rileggere
                            contaLibri++;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Libri inseriti nella mensola");
                    visualizza(mensola);
                }
                case 3 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }

    public static void visualizza(Libro[] mensola) {
        for (Libro libro : mensola) {
            if(libro != null)
                System.out.println(libro.FormattaDati());
        }
    }

    public static boolean ricerca(int contaLibri, Libro[] mensola,Libro libro) {
        for (int i = 0; i < contaLibri; i++) {
            if (mensola[i]!= null && libro.autore.equals(mensola[i].autore) && libro.titolo.equals(mensola[i].titolo)) {
                return true; // Libro trovato
            }
        }
        return false; // Libro non trovato
    }
}