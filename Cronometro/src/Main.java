public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();

        cronometro.avvia();

        Thread.sleep(2000); // Pausa di 2 secondi

        cronometro.arresta();

        System.out.println("Durata misurata: " + cronometro.getDurata() + " millisecondi");
    }
}
