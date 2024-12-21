package FrontScreen;

import corsa.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import static utility.Tools.*;

public class FrontEnd {

    private Scanner sc = new Scanner(System.in);
    private Gara gara; // Oggetto Gara, che contiene le informazioni della gara
    private ArrayList<Pilota> piloti = new ArrayList<>(); // Lista di piloti disponibili
    private ArrayList<Scuderia> griglia = new ArrayList<>(); // Lista di scuderie partecipanti

    // Metodo per creare una nuova gara
    public Gara setGara() {
        System.out.println("Inserisci nome gara: ");
        String nome = sc.nextLine();
        System.out.println("Inserisci nazionalità: ");
        String nazionalita = sc.nextLine();
        return new Gara(nome, nazionalita); // Ritorna un oggetto Gara con nome e nazionalità
    }

    // Metodo per inserire un pilota
    public Pilota inserisciPilota() {
        boolean controllo;
        Pilota pilota;
        do {
            controllo = false;
            System.out.println("Inserisci il nome del Pilota: ");
            String nome = sc.nextLine();
            System.out.println("Inserisci il cognome del Pilota: ");
            String cognome = sc.nextLine();
            System.out.println("Inserisci la nazionalità del Pilota: ");
            String nazionalita = sc.nextLine();
            pilota = new Pilota(nome, cognome);
            pilota.setNazionalita(nazionalita);

            // Controlla se il pilota è già presente nella lista
            for (int i = 0; i < piloti.size(); i++) {
                Pilota pilota1 = piloti.get(i);
                if (pilota.equals(pilota1)) {
                    System.out.println("Questo pilota è già presente. ");
                    controllo = true; // Riprova se il pilota esiste già
                }
            }
        } while (controllo);
        return pilota; // Ritorna l'oggetto Pilota creato
    }

    // Metodo per inserire una scuderia
    public Scuderia inserisciScuderia() {
        if (piloti.isEmpty()) {
            System.out.println("Non ci sono piloti disponibili per creare una scuderia.");
            return null; // Se non ci sono piloti, ritorna null
        }
        System.out.println("Nome della scuderia: ");
        String nomeScuderia = sc.nextLine();
        System.out.println("Numero auto della scuderia: ");
        int numeroAuto = sc.nextInt();
        sc.nextLine();

        System.out.println("Seleziona un pilota:");
        for (int i = 0; i < piloti.size(); i++) {
            System.out.printf("[%d] %s\n", i, piloti.get(i));
        }

        int scelta;
        do {
            System.out.println("Seleziona il numero del pilota: ");
            scelta = sc.nextInt();
            sc.nextLine();
            if (scelta < 0 || scelta >= piloti.size()) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta < 0 || scelta >= piloti.size());

        Pilota pilotaScelto = piloti.get(scelta);
        piloti.remove(scelta); // Rimuove il pilota selezionato dalla lista
        return new Scuderia(nomeScuderia, pilotaScelto, numeroAuto); // Crea e ritorna una nuova scuderia
    }

    // Metodo per mostrare l'elenco dei piloti disponibili
    public void mostraPiloti() {
        if (piloti.isEmpty()) {
            System.out.println("Nessun pilota disponibile.");
        } else {
            System.out.println("\nElenco Piloti:");
            piloti.forEach(pilota -> System.out.println(pilota.toString())); // Stampa ogni pilota
        }
    }

    // Metodo per mostrare l'elenco delle scuderie
    public void mostraScuderie() {
        if (griglia.isEmpty()) {
            System.out.println("Nessuna scuderia disponibile.");
        } else {
            System.out.println("\nElenco Scuderie:");
            griglia.forEach(scuderia -> System.out.println(scuderia.toString())); // Stampa ogni scuderia
        }
    }

    // Metodo per simulare la gara
    public void corriGara() throws InterruptedException {
        for (Scuderia s : gara.getGriglia()) {
            Cronometro crono = new Cronometro();
            crono.setStartTime();
            Thread.sleep(3000); // Simula il tempo di gara (3 secondi di pausa)
            crono.setEndTime();
            Random rn = new Random();
            int tempogiro = rn.nextInt(120); // Genera un tempo di giro casuale
            s.setTempoGiro(tempogiro); // Imposta il tempo giro per la scuderia
            System.out.println(s.getNome() + " ha finito il giro in " + tempogiro + " secondi");
        }
    }

    // Metodo per mostrare il vincitore
    public void mostraVincitore() {
        if (griglia.size() > 1) {
            Collections.sort(griglia); // Ordina la griglia in base al tempo giro
            System.out.println("\nIl vincitore della gara è: " + griglia.getFirst().getnPilota()); // Mostra il vincitore
        } else {
            System.out.println("Non è stata eseguita nessuna gara.");
        }
    }

    // Metodo per mostrare la classifica finale
    public void mostraClassifica() {
        if (griglia.size() > 1) {
            Collections.sort(griglia); // Ordina la griglia in base al tempo giro
            System.out.println("Classifica finale:");
            for (Scuderia s : griglia) {
                System.out.println(s + " - Tempo " + s.getTempoGiro()); // Stampa ogni scuderia con il suo tempo
            }
        }
    }

    // Metodo per il menu di gestione dell'applicazione
    public void menu() throws InterruptedException {
        final int MAXPILOTI = 10; // Limite massimo di piloti
        final int MAXSCUDERIE = 5; // Limite massimo di scuderie
        String[] opzioni = {"Gestione Gara", "Inserisci dati Gara", "Inserisci Pilota", "Visualizza Piloti", "Inserisci Scuderia", "Visualizza Scuderie", "Corri Gara", "Mostra Vincitore"};
        boolean esci = false;

        do {
            switch (Menu(opzioni, sc)) { // Mostra il menu e gestisce le opzioni
                case 1 -> gara = setGara(); // Imposta una nuova gara
                case 2 -> {
                    if (piloti.size() < MAXPILOTI) {
                        piloti.add(inserisciPilota()); // Aggiungi un pilota
                    } else {
                        System.out.println("La gara è già al completo.");
                    }
                }
                case 3 -> mostraPiloti(); // Mostra i piloti
                case 4 -> {
                    if (griglia.size() < MAXSCUDERIE) {
                        Scuderia scuderia = inserisciScuderia(); // Aggiungi una scuderia
                        if (scuderia != null) {
                            griglia.add(scuderia);
                            gara.setGriglia(griglia); // Aggiorna la griglia della gara
                        }
                    } else {
                        System.out.println("La gara è già al completo. ");
                    }
                }
                case 5 -> mostraScuderie(); // Mostra le scuderie
                case 6 -> {
                    if (griglia.size() > 1) {
                        corriGara(); // Esegue la gara se ci sono abbastanza scuderie
                    } else {
                        System.out.println("Almeno 2 macchine per poter fare la gara");
                    }
                }
                case 7 -> {
                    System.out.println(gara.toString());
                    mostraClassifica(); // Mostra la classifica
                    mostraVincitore(); // Mostra il vincitore
                    esci = true; // Esci dal programma
                    System.out.println("Fine del programma.");
                }
            }
        } while (!esci); // Continua il menu fino a quando non si esce
    }
}
