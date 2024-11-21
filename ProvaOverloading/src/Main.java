public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Pippo");
        System.out.println(studente1.getNome()); //Interfaccia pubblica
        Studente studente2 = new Studente("Paperino", "Paperone");
        System.out.println(studente2.getNome() + "  " + studente2.getCognome());
    }
}