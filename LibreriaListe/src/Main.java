import frontScreen.FrontEnd;
import mensola.Libro;

import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 3;
        ArrayList<Libro> mensola = new ArrayList<>();
        String[] opzioni = {"Menu", "Inserimento", "Visualizza", "Rimuovi Libro", "Modifica numero di pagine", "Visualizza libro per prezzo", "Uscita"};
        boolean esci = true;

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    if (mensola.size() < MAXLIBRI) {
                        System.out.println("Inserisci i dettagli del libro :");
                        System.out.println("Inserisci autore:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo:");
                        String titolo = tastiera.nextLine();

                        mensola.add(FrontEnd.LeggiLibro(tastiera, autore, titolo));
                    } else
                        System.out.println("La mensola è piena");

                }
                case 2 -> {
                    if (!mensola.isEmpty())
                        mensola.forEach(libro -> System.out.println("Libro: " + libro.formattaDati()));
                    else
                        System.out.println("Non ci sono libri da visualizzare");

                }
                case 3 -> {
                    if (!mensola.isEmpty()) {
                        System.out.println("Inserisci autore del libro da rimuovere:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo del libro da rimuovere:");
                        String titolo = tastiera.nextLine();
                        if (rimuoviLibro(mensola, autore, titolo))
                            System.out.println("Libro rimosso correttamente");
                        else
                            System.out.println("Libro non trovato");

                    } else
                        System.out.println("La mensola è vuota");

                }
                case 4 -> {
                    if (!mensola.isEmpty()) {
                        System.out.println("Inserisci autore del libro :");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo del libro :");
                        String titolo = tastiera.nextLine();
                        System.out.println("Modifica il numero di pagine:");

                        if (!(modificaNumeroDiPagine(mensola, autore, titolo, tastiera)))
                            System.out.println("Libro non trovato");

                    } else
                        System.out.println("La mensola è vuota");

                }

                case 5 -> {
                    System.out.println("Inserisci il prezzo del libro :");
                    double prezzo = Double.parseDouble(tastiera.nextLine());

                }
                case 6 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }

    public static boolean rimuoviLibro(ArrayList<Libro> mensola, String autore, String titolo) {
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).autore.equalsIgnoreCase(autore) && mensola.get(i).titolo.equalsIgnoreCase(titolo)) {
                mensola.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean modificaNumeroDiPagine(ArrayList<Libro> mensola, String autore, String titolo, Scanner sc) {
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).autore.equalsIgnoreCase(autore) && mensola.get(i).titolo.equalsIgnoreCase(titolo)) {
                mensola.get(i).pagine = Integer.parseInt(sc.nextLine());
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Libro> visualizzaLibroPerPrezzo(ArrayList<Libro> mensola, double prezzo) {
        ArrayList<Libro> =new ArrayList<>();
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).PREZZOPAGINA * mensola.get(i).pagine == prezzo) {

            }
        }
    }
}