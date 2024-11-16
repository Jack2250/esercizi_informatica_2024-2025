import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean esci = true;
        String[] opzioni = {"Gestione gara", "1-Inserimento pilota", "2-Assegnaziona auto", "3-Inizia gara"};
        do {
            switch (Menu(opzioni, sc)) {
                case 1 -> {

                }
            }

        } while (esci);

        System.out.println("Inserisci il nome del pilota");
        String nome = sc.nextLine();
        System.out.println("Inserisci il cognome del pilota");
        String cognome = sc.nextLine();
        System.out.println("Inserisci la nazionalità del pilota");
        String nazionalita = sc.nextLine();
        System.out.println("Inserisci l'età del pilota");
        int eta = Integer.parseInt(sc.nextLine());

        Pilota pilota1 = new Pilota(nome, cognome, nazionalita, eta);

        System.out.println("Inserisci il nome del pilota");
        String nome2 = sc.nextLine();
        System.out.println("Inserisci il cognome del pilota");
        String cognome2 = sc.nextLine();
        System.out.println("Inserisci la nazionalità del pilota");
        String nazionalita2 = sc.nextLine();
        System.out.println("Inserisci l'età del pilota");
        int eta2 = Integer.parseInt(sc.nextLine());

        Pilota pilota2 = new Pilota(nome2, cognome2, nazionalita2, eta2);

        try {
            if (pilota1.equals(pilota2))
                throw new Exception();
        } catch (Exception e) {
            System.out.println("I due piloti sono uguali");
        }

        System.out.println(pilota1.toString());
        System.out.println(pilota2.toString());

        System.out.println("Inserisci la scuderia dell'auto");
        String scuderia = sc.nextLine();
        System.out.println("Inseriscila cilindrata dell'auto");
        int cilindrata = Integer.parseInt(sc.nextLine());

        Auto auto1 = new Auto(scuderia, pilota1, cilindrata);

        System.out.println("Inserisci la scuderia dell'auto");
        String scuderia2 = sc.nextLine();
        System.out.println("Inseriscila cilindrata dell'auto");
        int cilindrata2 = Integer.parseInt(sc.nextLine());

        Auto auto2 = new Auto(scuderia2, pilota2, cilindrata2);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

    }
}
