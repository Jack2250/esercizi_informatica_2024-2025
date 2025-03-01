import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci il nome del giocatore 1: ");
        Giocatore g1 = new Giocatore(sc.nextLine());

        System.out.print("Inserisci il nome del giocatore 2: ");
        Giocatore g2 = new Giocatore(sc.nextLine());

        System.out.print("Inserisci il numero di round da giocare: ");
        int roundTotali = sc.nextInt();

        System.out.print("Inserisci il numero di facce del dado: ");
        int nFacceDado = sc.nextInt();

        Dado d1 = new Dado(nFacceDado);
        Dado d2 = new Dado(nFacceDado);
        Gara gara = new Gara();

        try {
            System.out.println("1-Partita base 2-Partita avanzata");
            int scelta = sc.nextInt();
            System.out.println(giocaPartita(scelta, gara, g1, g2, d1, d2, roundTotali));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String giocaPartita(int scelta, Gara g, Giocatore g1, Giocatore g2, Dado d1, Dado d2, int roundTotali) throws Exception {
        if (scelta == 1) {
            return g.partitaBase(g1, g2, d1, d2, roundTotali);
        } else if (scelta == 2) {
            return g.partitaAvanzata(g1, g2, d1, d2, roundTotali);
        } else {
            throw new Exception();
        }
    }
}