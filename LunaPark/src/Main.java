import persona.Biglietto;
import frontScreen.FrontEnd;

import static utility.Tools.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXPERSONE = 10;
        ArrayList<Biglietto> LunaPark = new ArrayList<>();
        String[] opzioni = {"Menu", "Entrata", "Prova Giostra", "Uscita", "Esci"};
        boolean esci = true;

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    if (LunaPark.size() < MAXPERSONE) {
                        Biglietto biglietto = FrontEnd.leggiBiglietto(tastiera);
                        LunaPark.add(biglietto);

                        biglietto.dataAccesso = LocalDateTime.now();
                        System.out.println("Biglietto creato: " + biglietto.formattadati());
                    } else {
                        System.out.println("Il luna park è pieno.");
                    }
                }
                case 2 -> {
                    if (!LunaPark.isEmpty()) {
                        System.out.println("Inserisci il numero del biglietto:");
                        int numeroBiglietto = Integer.parseInt(tastiera.nextLine());
                        Biglietto biglietto = null;

                        for (Biglietto b : LunaPark) {
                            if (b.numero == numeroBiglietto) {
                                biglietto = b;
                                break; // Esci dal ciclo una volta trovato
                            }
                        }

                        if (biglietto != null) {
                            // Stampa della giostra selezionata e della data di accesso
                            System.out.println("Hai provato la giostra: " + biglietto.tipo);
                            System.out.println("Data e ora di accesso: " + biglietto.dataAccesso);

                        } else {
                            System.out.println("Biglietto non trovato.");
                        }
                    } else {
                        System.out.println("Il luna park è vuoto.");
                    }
                }
                case 3 -> {
                    if (!LunaPark.isEmpty()) {
                        System.out.println("Inserisci il numero del biglietto per l'uscita:");
                        int numeroBiglietto = Integer.parseInt(tastiera.nextLine());
                        Biglietto bigliettoUscita = null;


                        for (Biglietto b : LunaPark) {
                            if (b.numero == numeroBiglietto) {
                                bigliettoUscita = b;
                                break; // Esci dal ciclo una volta trovato
                            }
                        }

                        if (bigliettoUscita != null) {
                            LunaPark.remove(bigliettoUscita);
                            System.out.println("Uscita avvenuta con successo per il biglietto numero: " + numeroBiglietto);
                        } else {
                            System.out.println("Biglietto non trovato.");
                        }
                    } else {
                        System.out.println("Nessuna persona nel luna park.");
                    }
                }
                case 4 -> {
                    System.out.println("Uscita");
                    esci = false;
                }

            }
        } while (esci);
    }
}
