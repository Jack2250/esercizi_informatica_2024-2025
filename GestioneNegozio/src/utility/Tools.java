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

    public static Smartphone leggiSmartphone() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il codice del prodotto");
        String codice = sc.nextLine();
        System.out.println("Inserisci la marca del prodotto");
        String marca = sc.nextLine();
        System.out.println("Inserisci il prezzo del prodotto");
        double prezzo = Double.parseDouble(sc.nextLine());
        System.out.println("Inserisci il modello del prodotto");
        String modello = sc.nextLine();
        System.out.println("Inserisci la memoria del prodotto");
        int memoria = Integer.parseInt(sc.nextLine());
        if (prezzo > 0 && memoria > 0)
            return new Smartphone(codice, marca, prezzo, modello, memoria);
        else throw new Exception("Il prezzo o la memoria sono minori di 0");
    }
}