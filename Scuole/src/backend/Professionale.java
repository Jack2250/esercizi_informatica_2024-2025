package backend;
public class Professionale extends Scuola{
    private int contributoAnnualeClasse = 2400;
    private int contributoAnnualeLaboratorio = 3000;

    protected Professionale(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
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
