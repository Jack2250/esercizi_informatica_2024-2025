import java.util.Scanner;

public class Gara {
    public Gara() {
    }

    //public boolean fineGara(Boolean fine) {

    //}

    public String winner(Giocatore g1, Giocatore g2) {
        if (g1.getVittorie() > g2.getVittorie()) {
            return g1.getNome() + "Ha vinto";
        } else if (g1.getVittorie() < g2.getVittorie()) {
            return g2.getNome() + "Ha vinto";
        } else {
            return "Parità";
        }
    }

    public void round(Giocatore g1, Giocatore g2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giocatore 1: Inserisci il numero di facce del dado");
        int valore1 = sc.nextInt();
        Dado d1 = new Dado(valore1);
        System.out.println("Giocatore 2: Inserisci il numero di facce del dado");
        int valore2 = sc.nextInt();
        Dado d2 = new Dado(valore2);

        d1.lancia();
        d2.lancia();
    }

    public void gameWin(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        if (d1.getValFaccia() > d2.getValFaccia()) {
            g1.setVittorie(g1.getVittorie() + 1);
        } else if (d1.getValFaccia() < d2.getValFaccia()) {
            g2.setVittorie(g2.getVittorie() + 1);
        } else {
            g1.setVittorie(g1.getVittorie() + 1);
            g2.setVittorie(g2.getVittorie() + 1);
        }
    }

    public void resetGame(Dado d1, Dado d2) {
        d1.setValFaccia(0);
        d2.setValFaccia(0);
    }
}