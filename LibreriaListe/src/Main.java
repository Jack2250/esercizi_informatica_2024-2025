import mensola.Libro;
import frontScreen.FrontEnd;
import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int contaLibri = 0;
        final int MAXLIBRI = 3;
        ArrayList<Libro> mensola =  new ArrayList<>();
        String[] opzioni = {"Menu", "1-Inserimento", "2-Visualizza","3-Rimuovi Libro","4-Uscita"};
        boolean esci = true;

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    if (contaLibri < MAXLIBRI) {
                        System.out.println("Inserisci i dettagli del libro :");
                        System.out.println("Inserisci autore:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo:");
                        String titolo = tastiera.nextLine();

                        mensola.add(FrontEnd.LeggiLibro(tastiera, autore, titolo));
                        contaLibri++;
                    }else{
                        System.out.println("La mensola è piena");
                    }
                }
                case 2 -> {
                    if(contaLibri>0){
                        mensola.forEach(libro -> System.out.println("Libro: " + libro.formattaDati()));
                    }else {
                        System.out.println("Non ci sono libri da visualizzare");
                    }
                }
                case 3 -> {
                    if(contaLibri>0){
                        System.out.println("Inserisci autore del libro da rimuovere:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo del libro da rimuovere:");
                        String titolo = tastiera.nextLine();
                        rimuoviLibro(mensola, contaLibri, autore, titolo);
                        System.out.println("Libro rimosso corretamente");
                        contaLibri--; // Dopo la rimozione, riduciamo il numero di libri
                    }else{
                        System.out.println("La mensola è vuota");
                    }
                }
                case 4 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }
    public static void rimuoviLibro(ArrayList<Libro> mensola, int contaLibri, String autore, String titolo ){
        for (int i = 0; i < contaLibri; i++) {
            if (mensola != null && mensola.get(i).autore.equalsIgnoreCase(autore) && mensola.get(i).titolo.equalsIgnoreCase(titolo)) {
                mensola.remove(i);
                return;
            }
        }
    }
}