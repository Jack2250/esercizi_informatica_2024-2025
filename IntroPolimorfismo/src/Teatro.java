import java.util.ArrayList;

public class Teatro {
    ArrayList<Persona> persone;
    final int MAXPERSONE = 10;

    public Teatro() {
        persone = new ArrayList<>();
    }

    public void entrataTeatro(Persona p) throws Exception {
        if (!persone.contains(p) && persone.size() < MAXPERSONE) {
            persone.add(p);
        } else {
            throw new Exception("Questa persona è già presente all'interno del teatro");
        }
    }

    public void stampaAVideo() { //NON DA FARE POICHE' NON E' BUONA PRATICA STAMPARE
        for (Persona persona : persone) {
            System.out.println(persona.presentazione());
        }
    }
}