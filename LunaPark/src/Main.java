import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBiglietto = 1;
        final int MAXPERSONE = 3;
        boolean esci = true;
        ArrayList<Persona> gestore = new ArrayList<>();
        String[] opzioni = {"GESTORE LUNAPARK", "Registra entrata", "Registra uscita", "Nuova giostra"};
        do {
            try {
                switch (Menu(opzioni, sc)) {
                    case 1 -> {
                        if (gestore.size() < MAXPERSONE) {
                            registraEntrata(nBiglietto);
                            nBiglietto++;
                        } else {
                            throw new Exception("Il luna park è pieno");
                        }

                    }
                    case 2 -> {

                    }
                    case 3 -> {

                    }
                    case 4 -> {
                        esci = false;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        } while (esci);
    }

    public static Persona registraEntrata(int nBiglietto,) {
        Persona cliente = new Persona();
        Random rn = new Random();

        cliente.biglietto = nBiglietto;
        switch (rn.nextInt(0, 4)) {
            case 1 -> cliente.giostreUsate = giostre.RUOTAPANORAMICA;

            case 2 -> cliente.giostreUsate = giostre.AUTOSCONTRO;

            case 3 -> cliente.giostreUsate = giostre.OTTOVOLANTE;

            case 4 -> cliente.giostreUsate = giostre.TAGADA;

        }
        return cliente;
    }
}