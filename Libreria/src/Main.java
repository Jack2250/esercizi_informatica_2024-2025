import Mensola.Libro;
import frontScreen.FrontEnd;
import static utility.Tools.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 1;
        int contaLibri = 0;
        Libro[] mensola = new Libro[MAXLIBRI];
        String[] opzioni = {"Menu", "1-Inserimento", "2-Visualizza", "3-Rimuovi Libro", "4-Cerca Libro", "5-Modifica Data di Pubblicazione", "6-Uscita"};
        boolean esci = true;

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    if (contaLibri < MAXLIBRI) {
                        System.out.println("Inserisci i dettagli del libro #:");

                        System.out.println("Inserisci autore:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo:");
                        String titolo = tastiera.nextLine();

                        // Verifica se il libro esiste già
                        if (ricerca(mensola, contaLibri, autore, titolo) != null) {
                            System.out.println("Il libro con autore " + autore + " e titolo " + titolo + " è già presente. Inserimento non consentito.");
                        } else {
                            mensola[contaLibri] = FrontEnd.LeggiLibro(tastiera, autore, titolo);
                            contaLibri++;
                        }
                    } else {
                        System.out.println("La mensola è piena!");
                    }
                }
                case 2 -> {
                    System.out.println("Libri inseriti nella mensola:");
                    visualizza(mensola, contaLibri);
                }
                case 3 -> {
                    // Rimuovere un libro
                    System.out.println("Inserisci autore del libro da rimuovere:");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci titolo del libro da rimuovere:");
                    String titolo = tastiera.nextLine();
                    rimuoviLibro(mensola, contaLibri, autore, titolo);
                    contaLibri--; // Dopo la rimozione, riduciamo il numero di libri
                }
                case 4 -> {
                    // Ricerca un libro per autore e titolo
                    System.out.println("Inserisci autore del libro da cercare:");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci titolo del libro da cercare:");
                    String titolo = tastiera.nextLine();
                    Libro libroTrovato = ricerca(mensola, contaLibri, autore, titolo);
                    if (libroTrovato != null) {
                        System.out.println("Libro trovato:" + libroTrovato.FormattaDati());
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                }
                case 5 -> {
                    // Modifica la data di pubblicazione
                    System.out.println("Inserisci autore del libro da modificare:");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci titolo del libro da modificare:");
                    String titolo = tastiera.nextLine();

                    Libro libroTrovato = ricerca(mensola, contaLibri, autore, titolo);
                    if (libroTrovato != null) {
                        System.out.println("Inserisci nuova data di pubblicazione in formato gg-MM-aaaa:");
                        String nuovaData = tastiera.nextLine();
                        modificaDataPubblicazione(libroTrovato, nuovaData);
                        System.out.println("Data di pubblicazione modificata con successo.");
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                }
                case 6 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }

    // Visualizza i libri presenti nella mensola
    public static void visualizza(Libro[] mensola, int contaLibri) {
        for (int i = 0; i < contaLibri; i++) {
            if (mensola[i] != null) {
                System.out.println(mensola[i].FormattaDati());
            }
        }
    }

    // Ricerca un libro per autore e titolo
    public static Libro ricerca(Libro[] mensola, int contaLibri, String autore, String titolo) {
        for (int i = 0; i < contaLibri; i++) {
            if (mensola[i] != null && mensola[i].autore.equals(autore) && mensola[i].titolo.equals(titolo)) {
                return mensola[i]; // Libro trovato
            }
        }
        return null; // Libro non trovato
    }

    // Rimuovi un libro e compatta l'array
    public static void rimuoviLibro(Libro[] mensola, int contaLibri, String autore, String titolo) {
        for (int i = 0; i < contaLibri; i++) {
            if (mensola[i] != null && mensola[i].autore.equals(autore) && mensola[i].titolo.equals(titolo)) {
                mensola[i] = null; // Rimuove il libro
                // Compattazione dell'array
                for (int j = i; j < contaLibri - 1; j++) {
                    mensola[j] = mensola[j + 1];
                }
                mensola[contaLibri - 1] = null; // Libera l'ultimo posto
                System.out.println("Libro rimosso correttamente.");
                return;
            }
        }
        System.out.println("Libro non trovato.");
    }

    // Modifica la data di pubblicazione di un libro
    public static void modificaDataPubblicazione(Libro libro, String nuovaData) {
        libro.dataDiPubblicazione = LocalDate.parse(nuovaData, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Formato data non valido.");
    }
}
