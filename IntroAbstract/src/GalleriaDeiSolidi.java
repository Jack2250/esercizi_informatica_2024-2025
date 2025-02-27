import java.util.ArrayList;

public class GalleriaDeiSolidi {
    private ArrayList<Solido> galleria;

    public GalleriaDeiSolidi() {
        galleria = new ArrayList<>();
    }

    public void inserisciSolido(Solido s) throws Exception {
        galleria.add(s.clone());
    }

    public ArrayList<Solido> getLista() throws CloneNotSupportedException {
        ArrayList<Solido> temp = new ArrayList<>();
        for (Solido s : galleria) {
            temp.add(s.clone());
        }
        return temp;
    }
}