import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();
        Persona p1 = new Persona("Diego", 32);
        Persona p2 = new Persona("Luca", 10);
        Persona p3 = new Persona("Giovanni", 22);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        scriviPersona(persone, "persone.csv");
    }

    public static void scriviPersona(ArrayList<Persona> archivio, String fileName) {
        ArrayList<String> listaStringhe = new ArrayList<>();
        try {
            for (Persona p : archivio) {
                listaStringhe.add(p.csv());
            }
            Files.write(Paths.get(fileName), listaStringhe);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Persona> leggiPersona(String fileName) {
        ArrayList<Persona> archivio = new ArrayList<>();
        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Path.of(fileName));
            String[] attributi;
            for (String linea : lines) {
                attributi = linea.split(";");
                archivio.add(new Persona(attributi[0], Integer.parseInt(attributi[1])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return archivio;
    }
}