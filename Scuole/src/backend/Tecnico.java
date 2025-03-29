package backend;

public class Tecnico extends Scuola{
    private int contributoAnnualeClasse = 3500;
    private int contributoAnnualeLaboratorio = 6000;

    protected Tecnico(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
        super(codiceAlfaNumerico, denominazione, indirizzo, citta, nStudenti, nClassi, nSediAggiuntive, nLaboratori);
    }

    @Override
    int getContributoTotale() {
        return 0;
    }

    @Override
    int getContributoStudenti() {
        return 0;
    }

    @Override
    int getContributoSedi() {
        return 0;
    }
}