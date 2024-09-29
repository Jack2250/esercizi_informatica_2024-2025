import static Utility.Tools.*;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 Rimuovi Numero", "4 rimuovi numero 2", "5 Fine"};
        boolean esci = true;
        final int MAXNUMERI = 10;
        int[] nEstratti = new int[MAXNUMERI];

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1:
                    System.out.println("Generazione");
                    generaNumeri(nEstratti);
                    break;
                case 2:
                    System.out.println("Visualizzazione");
                    for (int i = 0; i < nEstratti.length; i++) {
                        if (nEstratti[i] != 0) {
                            System.out.println(nEstratti[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il numero da rimuovere:");
                    int numeroDaEliminare = Integer.parseInt(tastiera.nextLine());
                    rimuoviNumero(nEstratti, numeroDaEliminare, MAXNUMERI);
                    break;
                case 4:
                    System.out.println("Inserisci il numero da rimuovere:");
                    numeroDaEliminare = Integer.parseInt(tastiera.nextLine());
                    nEstratti = rimuoviNumero2(nEstratti, numeroDaEliminare, MAXNUMERI);
                    break;
                case 5:
                    System.out.println("Fine");
                    esci = false;
                    break;
            }
        } while (esci);
    }

    public static void rimuoviNumero(int[] array, int numeroDaEliminare, int MAXNUMERI) {
        boolean trovato = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroDaEliminare) {
                trovato = true;

                // Sposta tutti gli elementi successivi di una posizione a sinistra
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                MAXNUMERI--;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Numero non trovato.");
        }
    }

    public static int[] rimuoviNumero2(int[] array, int numeroDaEliminare, int maxNumeri) {

        if (numeroDaEliminare < 1 || numeroDaEliminare > maxNumeri) {
            System.out.println("Valore fuori intervallo.");
            return array;
        }

        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroDaEliminare) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println("Valore non presente nel vettore.");
            return array;
        }

        int[] nuovoArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indice) {
                nuovoArray[j++] = array[i];
            }
        }

        System.out.println("Valore " + numeroDaEliminare + " rimosso con successo.");
        return nuovoArray;
    }

    public static void generaNumeri(int[] nEstratti) {
        Random numeroRandom = new Random();
        int i = 0;
        while (i < nEstratti.length) {
            int numero = numeroRandom.nextInt(1, nEstratti.length + 1);
            boolean doppio = false;
            for (int j = 0; j < i; j++) {
                if (nEstratti[j] == numero) {
                    doppio = true;
                    break;
                }
            }
            if (!doppio) {
                nEstratti[i] = numero;
                i++;
            }
        }
    }
}