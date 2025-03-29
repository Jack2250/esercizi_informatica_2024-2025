package backend;
public class Liceo extends Scuola{
    private int contributoAnnualeStudente = 150;
    private int contributoAnnualeLaboratorio = 1100;

    protected Liceo(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
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