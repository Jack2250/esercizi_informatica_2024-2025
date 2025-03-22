package utility;

import backend.Smartphone;

import java.util.Scanner;

public class Tools {
    /*public static void main(String[] args) {

    }*/
    private Tools() {
    }

    ; //impedisce di istanziare la classe

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) {// parametri formali
        int scelta;

        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            //tastiera.nextLine();
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        //tastiera.nextLine();
        return scelta;
    }

    public static Smartphone leggiSmartphone(Scanner sc) {
        System.out.print("Codice prodotto: ");
        String codice = sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        double prezzo = 0;
        while (prezzo <= 0) {
            System.out.print("Prezzo: ");
            prezzo = Double.parseDouble(sc.nextLine());
            if (prezzo <= 0) System.out.println("Il prezzo deve essere maggiore di zero.");
        }

        System.out.print("Modello: ");
        String modello = sc.nextLine();

        int memoria = 0;
        while (memoria <= 0) {
            System.out.print("Memoria in GB: ");
            memoria = Integer.parseInt(sc.nextLine());
            if (memoria <= 0) System.out.println("La memoria deve essere maggiore di zero.");
        }

        return new Smartphone(codice, marca, prezzo, modello, memoria);
    }
}