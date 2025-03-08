public class Gara {
    private int vittorieConsecutiveg1 = 0;
    private int vittorieConsecutiveg2 = 0;

    public Gara() {
    }

    public void roundBase(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        d1.lancia();
        d2.lancia();
        System.out.println(d1.getValFaccia());
        System.out.println(d2.getValFaccia());
        gameWin(g1, g2, d1, d2);
    }

    public void roundAvanzato(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        d1.lancia();
        d2.lancia();
        System.out.println(d1.getValFaccia());
        System.out.println(d2.getValFaccia());
        gameWinBonus(g1, g2, d1, d2);
    }

    private void gameWin(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        int confronto = d1.compareTo(d2);
        if (confronto > 0) {
            g1.incrementaVittorie();
            System.out.println(g1.getNome() + " vince il round!");
        } else if (confronto < 0) {
            g2.incrementaVittorie();
            System.out.println(g2.getNome() + " vince il round!");
        } else {
            g1.incrementaVittorie();
            g2.incrementaVittorie();
            System.out.println("Round in parità! Entrambi ottengono un punto.");
        }
    }

    private void gameWinBonus(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        int confronto = d1.compareTo(d2);

        if (confronto > 0) {
            g1.incrementaVittorie();
            vittorieConsecutiveg1++;
            vittorieConsecutiveg2 = 0;
            if (vittorieConsecutiveg1 == 3) {
                g1.incrementaVittorie();
                vittorieConsecutiveg1 = 0;
                System.out.println("Bonus assegnato a " + g1.getNome());
            }
            System.out.println(g1.getNome() + " vince il round!");
        } else if (confronto < 0) {
            g2.incrementaVittorie();
            vittorieConsecutiveg1 = 0;
            vittorieConsecutiveg2++;
            if (vittorieConsecutiveg2 == 3) {
                g2.incrementaVittorie();
                vittorieConsecutiveg2 = 0;
                System.out.println("Bonus assegnato a " + g2.getNome());
            }
            System.out.println(g2.getNome() + " vince il round!");
        } else {
            g1.incrementaVittorie();
            g2.incrementaVittorie();
            vittorieConsecutiveg1 = 0;
            vittorieConsecutiveg2 = 0;
            System.out.println("Round in parità! Entrambi ottengono un punto.");
        }
    }

    public String winner(Giocatore g1, Giocatore g2) {
        int confronto = g1.compareTo(g2);
        if (confronto > 0) {
            return g1.getNome() + " ha vinto la gara!";
        } else if (confronto < 0) {
            return g2.getNome() + " ha vinto la gara!";
        } else {
            return "La gara è finita in parità!";
        }
    }

    private boolean fineGara(int roundCorrente, int roundTotali) {
        return roundCorrente >= roundTotali;
    }

    private void resetGame(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        g1.resetVittorie();
        g2.resetVittorie();
        d1.reset();
        d2.reset();
    }

    public String partitaBase(Giocatore g1, Giocatore g2, Dado d1, Dado d2, int roundMassimi) {
        int roundCorrente = 0;
        do {
            roundBase(g1, g2, d1, d2);
            roundCorrente++;
        } while (!fineGara(roundCorrente, roundMassimi));
        return winner(g1, g2);
    }

    public String partitaAvanzata(Giocatore g1, Giocatore g2, Dado d1, Dado d2, int roundMassimi) {
        int roundCorrente = 0;
        do {
            roundAvanzato(g1, g2, d1, d2);
            roundCorrente++;
        } while (!fineGara(roundCorrente, roundMassimi));
        return winner(g1, g2);
    }
}