import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Biglietto {
    public int numeroBiglietto;
    public LocalDateTime momentoEvento; //o ingresso o salita in giostra
    public ListaGiostre giostreProvate;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd--MM-yyyy  hh:mm:ss");
        return "Biglietto" + numeroBiglietto + "Orario: " + momentoEvento.format(formatter);
    }
}