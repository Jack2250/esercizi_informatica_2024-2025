import backend.*;
import utility.Tools;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Negozio negozio = new Negozio();

        String[] opzioni = {"Negozio Elettronica", "1-Inserisci nuovo Smartphone", "2-Rimuovi Prodotto", "3-Cerca Prodotto per Codice", "4-Modifica Prezzo Prodotto", "5-Visualizza Prodotti", "6-Esci"};

        boolean esci = true;

        do {
            int scelta = Tools.Menu(opzioni, sc);

            switch (scelta) {
                case 1 -> {
                    try {
                        Smartphone s = Tools.leggiSmartphone(sc);
                        negozio.add(s);
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.print("Inserisci il codice del prodotto da rimuovere: ");
                    String codice = sc.nextLine();
                    try {
                        negozio.rimuoviProdotto(codice);
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                }

                case 3 -> {
                    System.out.print("Inserisci il codice del prodotto da cercare: ");
                    String codice = sc.nextLine();
                    try {
                        ProdottoElettronico prodotto = negozio.cercaProdotto(codice);
                        System.out.println("Prodotto trovato: " + prodotto);
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.print("Inserisci il codice del prodotto: ");
                    String codice = sc.nextLine();
                    System.out.print("Inserisci il nuovo prezzo: ");
                    double prezzo = Double.parseDouble(sc.nextLine());
                    try {
                        negozio.modificaPrezzo(codice, prezzo);
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                }

                case 5 -> {
                    try {
                        negozio.visualizza();
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                }

                case 6 -> {
                    esci = false;
                    System.out.println("Uscita...");
                }
            }
        } while (esci);
    }
}