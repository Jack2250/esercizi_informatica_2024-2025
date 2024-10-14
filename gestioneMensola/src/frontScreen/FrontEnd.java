package frontScreen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Mensola.Libro;
import Mensola.Genere;
// import utility.Tools;

import static utility.Tools.*;

public class FrontEnd {
    public static Libro LeggiLibro(Scanner tastiera) {
        Libro l = new Libro();
        System.out.println("Inserisci autore:");
        l.autore = tastiera.nextLine();
        System.out.println("Inserisci titolo:");
        l.titolo = tastiera.nextLine();
        System.out.println("Inserisci il tipo:");

        String[] opzioni = {"Tipo libro", "1 Romanzo", "2 Manuale", "3 Thriller"};

        switch (Menu(opzioni, tastiera)) {

            case 1 -> l.tipo = Genere.Romanzo;
            case 2 -> l.tipo = Genere.Manuale;
            case 3 -> l.tipo = Genere.Thriller;
        }

        System.out.println("Inserisci il numero di pagine:");
        l.pagine = Integer.parseInt(tastiera.nextLine()); // legge il numero di pagine
        System.out.println("Inserisci la data di pubblicazione in formato gg-MM-aaaa:");
        l.dataDiPubblicazione = LocalDate.parse(tastiera.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));


        return l;
    }
}