import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gson tgson = new Gson();
        Persona p = new Persona("Giovanni", 30);
        String json = tgson.toJson(p); //Serializzazione: trasforma un oggetto in stringa
        System.out.println(json);
        Persona personaFromJson = tgson.fromJson(json, Persona.class);
        System.out.println(personaFromJson);
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(p);
        persone.add(new Persona("Giacomo", 25));
        persone.add(new Persona("Stefania", 99));
        persone.add(new Persona("Yassir", 200));

        //SERIALIZZAZIONE DELLA COLLEZIONE PERSONE SU FILE IN FORMATO JSON
        Gson newJson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = newJson.toJson(persone);
        //System.out.println(jsonContent);
        try {
            Files.write(Paths.get("persone.json"), jsonContent.getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //DESERIALIZZAZIONE DELLA COLLEZIONE PERSONE SU FILE IN FORMATO JSON
        try {
            byte[] jsonData = Files.readAllBytes(Path.of("persone.json"));
            Persona[] collezione = tgson.fromJson(new String(jsonData), Persona[].class);
            ArrayList<Persona> archivio = new ArrayList<>(Arrays.asList(collezione));
            System.out.println(archivio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}