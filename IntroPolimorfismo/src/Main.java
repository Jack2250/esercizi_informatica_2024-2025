public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Francesco", "Bazaj", 33, "RO", "Rosso", "Milan");
        Docente d1 = new Docente("Francesco", "Bazaj", 33, "RO", "Rosso", "Milan");
        Studente s2 = new Studente("Francesco", "Bazaj", 33, "RO", "Rosso", "Milan");
        Teatro t = new Teatro();
        try {
            t.entrataTeatro(s1);
            t.entrataTeatro(s2);
            t.entrataTeatro(d1);
            t.stampaAVideo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}