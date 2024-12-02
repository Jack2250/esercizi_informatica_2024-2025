public class Cronometro {
    private long startTime; // Tempo di avvio in millisecondi
    private long endTime;   // Tempo di fine in millisecondi
    private boolean running; // Stato del cronometro

    public void avvia() {
        startTime = System.currentTimeMillis(); // Ottiene il tempo corrente
        running = true; // Imposta lo stato come in esecuzione
        System.out.println("Cronometro avviato!");
    }

    public void arresta() {
        if (running) { // Verifica se il cronometro è in esecuzione
            endTime = System.currentTimeMillis(); // Ottiene il tempo corrente
            running = false; // Cambia lo stato
            System.out.println("Cronometro arrestato!");
        } else {
            System.out.println("Il cronometro non è in esecuzione!");
        }
    }

    public long getDurata() {
        if (running) { // Se il cronometro è ancora in esecuzione, calcola in tempo reale
            return System.currentTimeMillis() - startTime;
        } else { // Se è fermo, usa il tempo di arresto
            return endTime - startTime;
        }
    }
}