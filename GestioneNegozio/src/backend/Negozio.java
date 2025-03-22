package backend;

import java.util.ArrayList;

public class Negozio {
    private ArrayList<ProdottoElettronico> prodotti;

    public Negozio() {
        prodotti = new ArrayList<>();
    }

    public void add(ProdottoElettronico p) throws Exception {
        for (ProdottoElettronico p2 : prodotti) {
            if (p.equals(p2)) {
                throw new Exception("Prodotto già esistente con codice: " + p.getCodiceProdotto());
            }
        }
        prodotti.add(p);
    }

    public void visualizza() throws Exception {
        if (prodotti.isEmpty()) {
            throw new Exception("Nessun prodotto presente!");
        }

        for (ProdottoElettronico p : prodotti) {
            System.out.println(p);
        }
    }

    public void rimuoviProdotto(String codice) throws Exception {
        if (prodotti.isEmpty()) {
            throw new Exception("Nessun prodotto presente!");
        }

        boolean trovato = false;

        for (int i = 0; i < prodotti.size(); i++) {
            if (prodotti.get(i).getCodiceProdotto().equals(codice)) {
                prodotti.remove(i);
                trovato = true;
            }
        }

        if (!trovato) {
            throw new Exception("Prodotto con codice " + codice + " non trovato.");
        }
    }

    public ProdottoElettronico cercaProdotto(String codice) throws Exception {
        if (prodotti.isEmpty()) {
            throw new Exception("Nessun prodotto presente!");
        }

        for (ProdottoElettronico p : prodotti) {
            if (p.getCodiceProdotto().equals(codice)) {
                return p;
            }
        }

        throw new Exception("Prodotto con codice " + codice + " non trovato.");
    }

    public void modificaPrezzo(String codice, double nuovoPrezzo) throws Exception {
        if (prodotti.isEmpty()) {
            throw new Exception("Nessun prodotto presente!");
        }
        ProdottoElettronico p = cercaProdotto(codice);
        p.setPrezzo(nuovoPrezzo);
    }
}