import java.util.Scanner;

import backend.*;
import utility.Tools;

import javax.tools.Tool;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Negozio n = new Negozio();
        String[] opzioni = {"Menu", "1-Inserimento", "2-Visualizza", "3-Rimuovi Smartphone", "4-Cerca Prodotto per codice", "5-Modifica Prezzo", "6-Uscita"};
        boolean esci = true;

        //Creare delle eccezioni:
        //quando si tenta di inserire un prodotto con codice
        //già esistente;

        do {
            switch (Tools.Menu(opzioni, sc)) {
                case 1 -> {
                    try {
                        n.add(Tools.leggiSmartphone());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        n.visualizza();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }
}