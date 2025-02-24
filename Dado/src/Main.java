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

        int roundCorrente = 0;
        while (!gara.fineGara(roundCorrente, roundTotali)) {
            System.out.println("Round " + (roundCorrente + 1));
            gara.round(g1, g2, d1, d2);
            roundCorrente++;
        }

        System.out.println(g1.getNome() + ": " + g1.getVittorie() + " vittorie");
        System.out.println(g2.getNome() + ": " + g2.getVittorie() + " vittorie");
        System.out.println(gara.winner(g1, g2));
    }
}