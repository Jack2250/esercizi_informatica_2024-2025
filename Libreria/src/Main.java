import Mensola.Libro;
import frontScreen.FrontEnd;
import static utility.Tools.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 2;
        Libro[] mensola = new Libro[MAXLIBRI];
        String[] opzioni = {"Menu", "1-Inserimento", "2-Visualizza", "3-Uscita"};
        boolean esci = true;
        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    for (int i = 0; i < MAXLIBRI; i++) {
                        System.out.println("Inserisci i dettagli del libro #" + (i + 1) + ":");
                        System.out.println("Inserisci autore:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo:");
                        String titolo = tastiera.nextLine();

                        // Verifica se il libro esiste già
                        if (ricerca(MAXLIBRI, mensola, autore, titolo)) {
                            System.out.println("Il libro con autore '" + autore + "' e titolo '" + titolo + "' è già presente. Inserimento non consentito.");
                        } else {
                            mensola[i] = FrontEnd.LeggiLibro(tastiera, autore, titolo); // Passo autore e titolo per evitare rileggere
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
            if (libro != null) {
                System.out.println(libro.FormattaDati());
            }
        }
    }

    public static boolean ricerca(int MAXLIBRI, Libro[] mensola, String autore, String titolo) {
        for (int i = 0; i < MAXLIBRI; i++) {
            if (mensola[i] != null && autore.equals(mensola[i].autore) && titolo.equals(mensola[i].titolo)) {
                return true; // Libro trovato
            }
        }
        return false; // Libro non trovato
    }
}
