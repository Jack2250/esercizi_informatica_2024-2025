import static Utility.Tools.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 Fine"};
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
                        System.out.println(nEstratti[i]);
                    }
                    break;
                case 3:
                    System.out.println("Fine");
                    esci = false;
                    break;
            }
        } while (esci);
    }

    public static void generaNumeri(int[] nEstratti) {
        Random numeroRandom = new Random();
        int i=0;
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