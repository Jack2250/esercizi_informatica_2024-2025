import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBiglietto = 0;
        int nPersone = 0;
        final int MAXPERSONE = 10;
        boolean esci = true;
        ArrayList<Biglietto> lista = new ArrayList<>();
        String[] opzioni = {"GESTORE LUNAPARK", "Registra entrata", "Nuova giostra", "Lista giostre per biglietto", "Registra uscita", "Esci"};
        do {

            switch (Menu(opzioni, sc)) {
                case 1 -> { //ingresso
                    try {
                        if (nPersone > MAXPERSONE)
                            throw new Exception();

                        nPersone++; //Bisognerà fare anche nPersona--
                        Biglietto p = metodoCreazioneBiglietto(++nBiglietto);
                        lista.add(p);
                        System.out.println("Numero assegnato al cliente: " + nBiglietto);

                    } catch (Exception e) {
                        System.out.println("Il luna park è pieno");
                    }
                }
                case 2 -> { //Nuova giostra
                    System.out.println("Numero biglietto cliente: ");
                    int numeroB = Integer.parseInt(sc.nextLine());
                    if (metodoTrovaBiglietto(numeroB, lista)) {
                        Biglietto p = metodoNuovaGiostra(nBiglietto, sc);
                        lista.add(p);
                    } else {
                        System.out.println("Biglietto non trovato");
                    }

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> esci = false;
            }

        } while (esci);
    }

    public static Biglietto metodoCreazioneBiglietto(int nBiglietto) {
        Biglietto cliente = new Biglietto();

        cliente.numeroBiglietto = nBiglietto;
        cliente.momentoEvento = LocalDateTime.now(); //momento dell'ingresso

        return cliente;
    }

    public static Biglietto metodoNuovaGiostra(int nBiglietto, Scanner sc) {
        Biglietto cliente = new Biglietto();
        boolean esci;
        do {
            try {
                System.out.println("Quale giostra vuoi provare? {RUOTAPANORAMICA, AUTOSCONTRO, OTTOVOLANTE, TAGADA}");
                cliente.giostreProvate = ListaGiostre.valueOf(sc.nextLine().toUpperCase());
                esci = true;
            } catch (Exception e) {
                System.out.println("Giostra non valida");
                esci = false;
            }
        } while (!esci);

        cliente.numeroBiglietto = nBiglietto;
        cliente.momentoEvento = LocalDateTime.now(); //momento nuova giostra

        return cliente;
    }
}