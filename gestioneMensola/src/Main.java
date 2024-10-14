import Mensola.Libro;
import frontScreen.FrontEnd;
import static utility.Tools.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 2;
        Libro[] mensola = new Libro[MAXLIBRI];
        String[] opzioni = {"Menu", "1-Inserimento","2-Visualizza","3-Ricerca","4-Uscita"};
        boolean esci = true;
        do {
            switch (Menu(opzioni, tastiera)) {
                case 1->{
                    for (int i = 0; i < MAXLIBRI; i++) {
                        System.out.println("Inserisci i dettagli del libro #" + (i + 1) + ":");
                        mensola[i] = FrontEnd.LeggiLibro(tastiera);
                    }
                }
                case 2-> {
                    System.out.println("Libri inseriti nella mensola");
                    visualizza(mensola);
                }

                case 3->{
                    System.out.println("Inserisci l'autore da ricercare");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci il titolo da ricercare");
                    String titolo = tastiera.nextLine();

                    if(ricerca(MAXLIBRI, mensola, autore, titolo)){
                        System.out.println("Ci sono dei libri con lo stesso autore e lo stesso titolo");
                    }else{
                        System.out.println("Il libro hanno autore e titolo diverso");
                    }
                }

                case 4-> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }

    public static void visualizza (Libro [] mensola){
        for (Libro libro : mensola) {
            System.out.println(libro.FormattaDati());
        }
    }
    public static boolean ricerca (int MAXLIBRI,Libro [] mensola,String autore,String titolo){
        boolean trovato = true;

        for(int i = 0;i<MAXLIBRI;i++){
            if(autore.equals(mensola[i].autore) && titolo.equals(mensola[i].titolo)){
                return trovato;
            }
        }
        return false;
    }
}