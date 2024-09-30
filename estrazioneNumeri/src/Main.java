import static Utility.Tools.*;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 Ricerca","4 Cancella numero", "5 vettore dispari","6 ordina vettore","7 raddoppia vettore","8 Fine"};
        boolean esci = true;
        final int MAXNUMERI = 50;
        int[] nEstratti = new int[MAXNUMERI];
        int numero;
        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 ->{
                    System.out.println("Generazione");
                    generaNumeri(nEstratti);
                }
                case 2 -> {
                    System.out.println("Visualizzazione");
                    visualizza(nEstratti);
                }
                case 3 -> {
                    System.out.println("Inserire il numero da trovare");
                    numero = trovaNumero(Integer.parseInt(tastiera.nextLine()), nEstratti);
                    if(numero == -1) {
                        System.out.println("Numero non trovato");
                    } else {
                        System.out.println(numero);
                    }
                }
                case 4 -> {
                    System.out.println("Inserire il numero da cancellare");
                    int posizione = cancellaNumero(Integer.parseInt(tastiera.nextLine()), nEstratti);
                    if(posizione != -1){
                        System.out.println("L'elemento cancellato era in posizione " + posizione);
                    } else {
                        System.out.println("Elemento non presente");
                    }
                }

                case 5 -> {
                    int [] arrayDispari =arrayDispari(nEstratti);
                    for(int i=0;i<arrayDispari.length;i++){
                        System.out.println("I dispari sono"+ arrayDispari[i]);
                    }

                }
                case 6-> {
                    ordinaArray(nEstratti);
                    System.out.println("L'array ordinato è:");
                    for(int i=0;i< nEstratti.length;i++){
                        System.out.println(nEstratti[i]);
                    }
                }

                case 7-> {
                    int [] arrayRaddoppiato = raddoppiaArray(nEstratti,MAXNUMERI);
                    System.out.println("Il nuovo vettore è:");
                    for(int i=0;i<arrayRaddoppiato.length;i++){
                        System.out.println(arrayRaddoppiato[i]);
                    }
                }
                case 8 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }


    public static void generaNumeri(int[] array) {
        Random numeroRandom = new Random();
        int numero; // numero da generare e inserire nel vettore
        int cont = 0; // verifica quanti numeri sono presenti senza ripetizioni
        boolean presente;

        do {
            numero = numeroRandom.nextInt(0, array.length) + 1;
            presente = false; // true se numero presente, false se no


            for (int i = 0; i < cont; i++) { // Controlla se il numero è già presente
                if (array[i] == numero) {
                    presente = true;
                }
            }


            if (!presente) { // se presente = true, lo aggiungo al vettore
                array[cont] = numero;
                cont++;
            }
        } while (cont < array.length);
    }

    public static void visualizza(int[] array) {
        int cont = 0;
        for (int i : array) {
            System.out.printf("%4d", i);
            cont++;
            if (cont == 10) {
                cont = 0;
                System.out.println();
            }
        }
    }


    public static int trovaNumero(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int cancellaNumero(int numeroDaTrovare, int[] array){
        int numero = trovaNumero(numeroDaTrovare, array);
        if(numero != -1){
            for(int i = numero; i < array.length - 1; i++){
                array[i] = array [i+1];
            }
            array[array.length-1] = 0;
        }
        return numero;
    }


    public static int[] arrayDispari(int[] array) {
        int contDispari=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0) {
                contDispari++;
            }
        }

        int[] nuovoArray = new int[contDispari];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                nuovoArray[j] = array[i];
                j++;
            }
        }
        return nuovoArray;
    }

    public static void ordinaArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Trova il minimo elemento tra array[i] e array[n-1]
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int [] raddoppiaArray(int []array,int max){
        max = max *2;
        int [] nuovoArray = new int [max];
        for(int i=0;i<array.length;i++){
            nuovoArray[i] = array[i];
        }
        return nuovoArray;
    }
}

