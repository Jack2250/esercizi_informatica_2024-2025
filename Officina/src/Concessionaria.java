import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Veicolo> officina = new ArrayList<>();

    public void addVeicolo(Veicolo v){
        officina.add(v);
    }
    public int numeroVeicoli(){
        return officina.size();
    }
}