import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Studente st = new Studente("Giacomo", "Redi", 8, 19);
            Studente st1 = new Studente("Francesco", "Marchetto", 6, 19);
            System.out.println(st);
            System.out.println(st1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Il programma continua...");

        int numeroMagico = sc.nextInt();

        try {
            if (numeroMagico < 100) {
                throw new Exception("Numero minore di 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}