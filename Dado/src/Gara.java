class Gara {
    public void round(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        d1.lancia();
        d2.lancia();
        System.out.println(d1.getValFaccia());
        System.out.println(d2.getValFaccia());
        gameWin(g1, g2, d1, d2);
    }

    public void gameWin(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
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

    public boolean fineGara(int roundCorrente, int roundTotali) {
        return roundCorrente >= roundTotali;
    }

    public void resetGame(Giocatore g1, Giocatore g2, Dado d1, Dado d2) {
        g1.resetVittorie();
        g2.resetVittorie();
        d1.reset();
        d2.reset();
    }
}