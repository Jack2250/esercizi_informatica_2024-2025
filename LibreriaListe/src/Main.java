import frontScreen.FrontEnd;
import mensola.Libro;
import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 3;
        ArrayList<Libro> mensola =  new ArrayList<>();
        String[] opzioni = {"Menu", "Inserimento", "Visualizza","Rimuovi Libro","Uscita"};
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
                    }else{
                        System.out.println("La mensola è piena");
                    }
                }
                case 2 -> {
                    if(!mensola.isEmpty()){
                        mensola.forEach(libro -> System.out.println("Libro: " + libro.formattaDati()));
                    }else {
                        System.out.println("Non ci sono libri da visualizzare");
                    }
                }
                case 3 -> {
                    if(!mensola.isEmpty()){
                        System.out.println("Inserisci autore del libro da rimuovere:");
                        String autore = tastiera.nextLine();
                        System.out.println("Inserisci titolo del libro da rimuovere:");
                        String titolo = tastiera.nextLine();
                        if(rimuoviLibro(mensola, autore, titolo)){
                            System.out.println("Libro rimosso corretamente");
                        }else{
                            System.out.println("Libro non trovato");
                        }
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
    public static boolean rimuoviLibro(ArrayList<Libro> mensola, String autore, String titolo ){
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).autore.equalsIgnoreCase(autore) && mensola.get(i).titolo.equalsIgnoreCase(titolo)) {
                mensola.remove(i);
                return true;
            }
        }
        return false;
    }
}