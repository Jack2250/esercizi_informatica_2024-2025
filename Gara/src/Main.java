import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pilota> listaPiloti = new ArrayList<>();

        try {
            System.out.println("Inserisci nome e cognome del pilota");
            Pilota pilota1 = new Pilota(sc.nextLine(), sc.nextLine());
            System.out.println("Inserisci nome e cognome del pilota");
            Pilota pilota2 = new Pilota(sc.nextLine(), sc.nextLine());

            listaPiloti.add(pilota1);
            listaPiloti.add(pilota2);

            System.out.println(pilota1.toString());
            System.out.println(pilota2.toString());

            if (pilota1.equals(pilota2))
                System.out.println("Sono uguali");
            else
                System.out.println("I piloti non sono uguali");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}