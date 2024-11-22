import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Inserisci le coordinate del punto in alto a sinistra :");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("Inserisci la base del rettangolo:");
            int base = scanner.nextInt();

            System.out.println("Inserisci l'altezza del rettangolo:");
            int altezza = scanner.nextInt();

            Punto altoSinistra = new Punto(x, y);
            Rettangolo rettangolo = new Rettangolo(altoSinistra, base, altezza);

            System.out.println("Segmenti del rettangolo:");
            for (Segmento segmento : rettangolo.getSegmenti()) {
                System.out.println(segmento);
            }

        } catch (Exception e) {
            System.err.println("Errore: Inserisci valori positivi");
        }
    }
}
