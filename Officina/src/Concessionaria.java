import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {
    ArrayList<Veicolo> officina = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addveicolo(Veicolo v) {
        if (!officina.equals(v))
            officina.add(v);
    }

    public int numeroVeicoli() {
        return officina.size();
    }

    public void stampaVeicoli() {
        for (Veicolo v : officina) {
            System.out.println(v);
        }
    }

    public void modificaVeicolo() {
        if (officina.isEmpty()) return;

        System.out.println("Inserisci il numero del veicolo da modificare: ");
        int scelta = sc.nextInt();
        sc.nextLine();  // Pulire il buffer

        if (scelta < 1 || scelta > officina.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        Veicolo selezionato = officina.get(scelta - 1);
        System.out.println("Veicolo selezionato: " + selezionato);
        System.out.println("Inserisci il nuovo prezzo: ");
        int nuovoPrezzo = sc.nextInt();
        sc.nextLine();

        selezionato.setPrezzo(nuovoPrezzo);
        if (selezionato instanceof Moto) {
            System.out.println("Inserisci la nuova cilindrata: ");
            int nuovaCilindrata = sc.nextInt();
            ((Moto) selezionato).setCilindrata(nuovaCilindrata);
        }

        System.out.println("Veicolo modificato con successo!");
    }

    public void eliminaVeicolo() {
        System.out.println("Inserisci il modello del veicolo da eliminare:");
        String modello = sc.nextLine();

        boolean rimosso = officina.removeIf(v -> v.getModello().equalsIgnoreCase(modello));

        if (rimosso) {
            System.out.println("Veicolo eliminato con successo.");
        } else {
            System.out.println("Nessun veicolo trovato con il modello specificato.");
        }
    }
}
