import FrontScreen.FrontEnd;

public class Main {
    public static void main(String[] args) {
        try {
            // Crea un'istanza della classe FrontEnd, che gestisce l'interfaccia utente
            FrontEnd frontEnd = new FrontEnd();

            // Chiama il metodo menu() per avviare il menu principale
            frontEnd.menu();
        } catch (Exception e) {
            // Gestisce qualsiasi eccezione che possa verificarsi durante l'esecuzione
            // Stampa il messaggio dell'eccezione per capire il tipo di errore
            System.out.println("Errore: " + e.getMessage());
        }
    }
}