import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    public int biglietto;
    public LocalDateTime entrata = LocalDateTime.now();
    public giostre giostreUsate;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd--MM-yyyy  hh:mm:ss");
        return "biglietto" + biglietto + "Orario di entrata" + entrata.format(formatter);
    }
}
