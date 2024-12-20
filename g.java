// Main.java
import FrontScreen.FrontEnd;

public class Main {
    public static void main(String[] args) {
        try {
            FrontEnd.menu();
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

// Scuderia.java
package lol;

public class Scuderia implements Comparable<Scuderia> {
    private String nome;
    private Pilota nPilota;
    private Integer tempoGiro;
    private int nAuto;

    public Scuderia(String nome, Pilota nPilota, int nAuto) {
        this.nome = nome;
        this.nPilota = nPilota;
        this.nAuto = nAuto;
    }

    public String getNome() {
        return nome;
    }

    public Pilota getnPilota() {
        return nPilota;
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    public void setTempoGiro(int tempoGiro) {
        this.tempoGiro = tempoGiro;
    }

    public int getnAuto() {
        return nAuto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Pilota: %s %s, Tempo giro: %d, Numero auto: %d",
                nome, nPilota.getNome(), nPilota.getCognome(), tempoGiro, nAuto);
    }

    @Override
    public int compareTo(Scuderia s) {
        return this.tempoGiro.compareTo(s.getTempoGiro());
    }
}

// Tools.java
package utility;

import java.util.Scanner;

public class Tools {
    private Tools() {} // Impedisce l'istanza della classe

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int menu(String[] opzioni, Scanner tastiera) {
        int scelta;
        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "] " + opzioni[i]);
            }
            try {
                scelta = Integer.parseInt(tastiera.nextLine());
            } catch (NumberFormatException e) {
                scelta = -1;
            }
            if (scelta < 1 || scelta >= opzioni.length) {
                System.out.println("Opzione sbagliata");
                wait(2000);
            }
        } while (scelta < 1 || scelta >= opzioni.length);
        return scelta;
    }
}

// Pilota.java
package lol;

public class Pilota {
    private String nome;
    private String cognome;
    private String nazionalita;

    public Pilota(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s, Nazionalità: %s", nome, cognome, nazionalita);
    }
}

// Cronometro.java
package lol;

import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime;
    private LocalTime endTime;
    private int tempoGiro;

    public void setStartTime() {
        startTime = LocalTime.now();
    }

    public void setEndTime() {
        endTime = LocalTime.now();
    }

    public int calcolaTempoGiro() {
        if (startTime == null || endTime == null) {
            return -1;
        }
        tempoGiro = endTime.toSecondOfDay() - startTime.toSecondOfDay();
        return tempoGiro > 0 ? tempoGiro : -1;
    }

    @Override
    public String toString() {
        return tempoGiro > 0 ? String.format("Tempo del giro: %d secondi", tempoGiro) : "Errore nel calcolo del tempo.";
    }
}

// FrontEnd.java
package FrontScreen;

import lol.*;
import utility.Tools;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FrontEnd {
    private static Scanner sc = new Scanner(System.in);
    private static Gara gara;
    private static ArrayList<Pilota> piloti = new ArrayList<>();
    private static ArrayList<Scuderia> griglia = new ArrayList<>();

    public static Pilota inserisciPilota() {
        System.out.print("Inserisci il nome del Pilota: ");
        String nome = sc.nextLine();
        System.out.print("Inserisci il cognome del Pilota: ");
        String cognome = sc.nextLine();
        System.out.print("Inserisci la nazionalità del Pilota: ");
        String nazionalita = sc.nextLine();
        Pilota pilota = new Pilota(nome, cognome);
        pilota.setNazionalita(nazionalita);
        return pilota;
    }

    public static Scuderia inserisciScuderia() {
        System.out.print("Nome della scuderia: ");
        String nome = sc.nextLine();
        System.out.print("Numero auto della scuderia: ");
        int nAuto = Integer.parseInt(sc.nextLine());

        System.out.println("Seleziona un pilota:");
        for (int i = 0; i < piloti.size(); i++) {
            System.out.printf("[%d] %s\n", i, piloti.get(i));
        }
        int scelta = Integer.parseInt(sc.nextLine());
        Pilota pilota = piloti.get(scelta);
        return new Scuderia(nome, pilota, nAuto);
    }

    public static void corriGara() {
        griglia.sort(Scuderia::compareTo);
        System.out.println("Classifica finale:");
        griglia.forEach(System.out::println);
    }

    public static void menu() {
        String[] opzioni = {
                "Gestione Gara", "1-Inserisci Pilota", "2-Inserisci Scuderia", "3-Corri Gara", "4-Esci"
        };
        boolean esci = false;
        while (!esci) {
            int scelta = Tools.menu(opzioni, sc);
            switch (scelta) {
                case 1 -> piloti.add(inserisciPilota());
                case 2 -> griglia.add(inserisciScuderia());
                case 3 -> corriGara();
                case 4 -> esci = true;
            }
        }
    }
}
