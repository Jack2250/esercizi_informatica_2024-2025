import Mensola.Libro;
import frontScreen.FrontEnd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 3;
        Libro[] mensola = new Libro[MAXLIBRI];

        for (int i = 0; i < MAXLIBRI; i++) {
            System.out.println("Inserisci i dettagli del libro #" + (i + 1) + ":");
            mensola[i] = FrontEnd.LeggiLibro(tastiera);
        }

        System.out.println("Libri inseriti nella mensola:");
        for (Libro libro : mensola) {
            System.out.println(libro.FormattaDati());
        }
    }
}
