import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pilota pilota1 = new Pilota("Mario", "Rossi", "Italia", 30);
        Pilota pilota2 = new Pilota("Luigi", "Verdi", "Italia", 28);

        Auto auto1 = new Auto("Ferrari", pilota1, 3000);
        Auto auto2 = new Auto("Lamborghini", pilota2, 3500);

        ArrayList<Auto> autoPartecipanti = new ArrayList<>();
        autoPartecipanti.add(auto1);
        autoPartecipanti.add(auto2);

        Gara gara = new Gara("Gran premio di Monza", autoPartecipanti);
        gara.corriGara();
        if (gara.corriGara() == null) {
            System.out.println("Non ci sono auto che partecipano alla gara");
        } else {
            System.out.println(gara.getRisultato());
        }
    }
}