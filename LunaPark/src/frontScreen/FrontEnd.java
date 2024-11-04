package frontScreen;

import persona.Biglietto;
import persona.Giostre;

import static utility.Tools.*;

import java.util.Random;
import java.util.Scanner;

public class FrontEnd {
    public static Biglietto leggiBiglietto(Scanner tastiera) {
        Biglietto l = new Biglietto();

        Random random = new Random();
        l.numero = random.nextInt(20);

        System.out.println("Inserisci la giostra da provare:");

        String[] opzioni = {"Giostre", "1 Ruota Panoramica ", "2 Autoscontro", "3 Ottovolante", "4 tagadà"};

        switch (Menu(opzioni, tastiera)) {
            case 1 -> l.tipo = Giostre.ruotaPanoramica;
            case 2 -> l.tipo = Giostre.autoscontro;
            case 3 -> l.tipo = Giostre.ottovolante;
            case 4 -> l.tipo = Giostre.tagadà;
        }
        return l;
    }
}
