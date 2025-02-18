public class Main {
    public static void main(String[] args) {
        Giocatore g1 = new Giocatore("Luca");
        Giocatore g2 = new Giocatore("Marco");
        Dado d1 = new Dado(6);
        Dado d2 = new Dado(6);
        Gara gara = new Gara();

        gara.round(g1, g2);
        gara.gameWin(g1, g2, d1, d2);
        gara.winner(g1, g2);

    }
}