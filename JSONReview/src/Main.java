import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Nome1", "Cognome1", 20, true));
        persone.add(new Persona("Nome2", "Cognome2", 2, true));
        persone.add(new Persona("Nome3", "Cognome3", 28, false));
        persone.add(new Persona("Nome4", "Cognome4", 34, true));
        persone.add(new Persona("Nome5", "Cognome5", 26, false));

        try {
            salvaJson("Persone.json", persone);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        leggiJson("Persone.json");

    }

    public static void salvaJson(String fileName, ArrayList<Persona> persone) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = gson.toJson(persone);
        Files.write(Paths.get(fileName), jsonContent.getBytes());
    }

    public static String leggiJson(String fileName) {
        return "";
    }
}