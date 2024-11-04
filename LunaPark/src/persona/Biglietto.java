package persona;

import java.time.LocalDateTime;
import java.util.Random;

public class Biglietto {

    public int numero;
    public LocalDateTime dataAccesso;
    public Giostre tipo;

    public String formattadati() {
        return String.format("Numero del biglietto: %d , Giostra: %s , Data e ora: %s ", numero, tipo, dataAccesso);
    }
}