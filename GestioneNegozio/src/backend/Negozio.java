package backend;

import java.util.ArrayList;

public class Negozio {
    private ArrayList<ProdottoElettronico> listaNegozio;
    private final int MAXPRODOTTI = 2;

    public Negozio() {
        this.listaNegozio = new ArrayList<>();
    }

    public void add(ProdottoElettronico p) throws Exception {
        for (ProdottoElettronico p2 : listaNegozio) {
            if (listaNegozio.size() < MAXPRODOTTI && !(p.equals(p2))) {
                listaNegozio.add(p.clone());
            } else {
                throw new Exception();
            }
        }
    }

    public void visualizza() throws Exception {
        if (!listaNegozio.isEmpty()) {
            for (ProdottoElettronico p : listaNegozio) {
                System.out.println(p.clone().toString());
            }
        } else {
            throw new Exception("La lista è vuota");
        }
    }
}