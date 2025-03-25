public class Media extends Scuola {
    private int contributoAnnualeStudente = 150;
    private int contributoAnnualeLaboratorio = 1100;
    private int contributoAnnualeSede = 9000;

    public Media(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
        super(codiceAlfaNumerico, denominazione, indirizzo, citta, nStudenti, nClassi, nSediAggiuntive, nLaboratori);
    }

    public int getContributoAnnualeStudente() {
        return contributoAnnualeStudente;
    }

    public void setContributoAnnualeStudente(int contributoAnnualeStudente) {
        this.contributoAnnualeStudente = contributoAnnualeStudente;
    }

    public int getContributoAnnualeLaboratorio() {
        return contributoAnnualeLaboratorio;
    }

    public void setContributoAnnualeLaboratorio(int contributoAnnualeLaboratorio) {
        this.contributoAnnualeLaboratorio = contributoAnnualeLaboratorio;
    }

    public int getContributoAnnualeSede() {
        return contributoAnnualeSede;
    }

    public void setContributoAnnualeSede(int contributoAnnualeSede) {
        this.contributoAnnualeSede = contributoAnnualeSede;
    }

    @Override
    public int getContributoTotale() {
        return getContributoLaboratori() + getContributoStudenti() + getContributoSedi();
    }

    @Override
    public int getContributoStudenti() {
        return getContributoAnnualeStudente() * nStudenti;
    }

    @Override
    public int getContributoSedi() {
        return getContributoAnnualeSede() * nSediAggiuntive;
    }

    public int getContributoLaboratori() {
        return getContributoAnnualeLaboratorio() * nLaboratori;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Contributo per gli studenti: %d Contributo per i laboratori: %d Contributo per le sedi: %d", );
    }
}