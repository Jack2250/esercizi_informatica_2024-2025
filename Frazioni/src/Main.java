import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il numeratore della prima frazione");
        double numeratore = sc.nextDouble();
        System.out.println("Inserisci il denominatore della prima frazione");
        double denominatore = sc.nextDouble();
        System.out.println("Inserisci il numeratore della seconda frazione");
        double numeratore2 = sc.nextDouble();
        System.out.println("Inserisci il denominatore della seconda frazione");
        double denominatore2 = sc.nextDouble();

        try {
            Frazione frazione1 = new Frazione(numeratore, denominatore);
            System.out.println(frazione1.toString());
            Frazione frazione2 = new Frazione(numeratore2, denominatore2);
            System.out.println(frazione2.toString());

            System.out.println("La somma delle frazioni in frazione è: " + frazione1.sommaFrazioni(frazione1, frazione2));
            System.out.println("La somma delle frazioni in numero è: " + frazione1.sommaFrazioni2(frazione1, frazione2));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}