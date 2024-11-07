import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    public int numeroBiglietto;
    public LocalDateTime momentoEvento; //o ingresso o salita in giostra
    public ListaGiostre giostreProvate;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd--MM-yyyy  hh:mm:ss");
        return "biglietto" + numeroBiglietto + "Orario: " + momentoEvento.format(formatter);
    }
}
