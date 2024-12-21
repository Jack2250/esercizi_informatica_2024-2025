package corsa;

import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime; // Orario di inizio
    private LocalTime endTime;   // Orario di fine
    private int tempoGiro;       // Tempo del giro in secondi


    public void setStartTime() {
        startTime = LocalTime.now();
    }

    public void setEndTime() throws InterruptedException {
        Thread.sleep(1000); // Simula un'attesa per rappresentare il tempo trascorso
        endTime = LocalTime.now();
    }

    public int calcolaTempoGiro() {
        // Verifica che gli orari di inizio e fine siano stati impostati correttamente
        if (startTime == null || endTime == null) {
            System.out.println("Errore: startTime o endTime non sono stati settati.");
            return -1;
        }

        // Calcolo della differenza in secondi tra i due orari
        tempoGiro = endTime.toSecondOfDay() - startTime.toSecondOfDay();

        // Controlla che l'orario di fine non sia precedente o uguale a quello di inizio
        if (tempoGiro <= 0) {
            System.out.println("Errore: Il tempo di fine è uguale o precedente al tempo di inizio.");
            return -1;
        }

        return tempoGiro;
    }

    @Override
    public String toString() {
        // Gestione di un eventuale errore nel calcolo del tempo
        if (tempoGiro < 0) {
            return "Errore nel calcolo del tempo.";
        }
        return String.format("Tempo del giro: %d secondi", tempoGiro);
    }
}
