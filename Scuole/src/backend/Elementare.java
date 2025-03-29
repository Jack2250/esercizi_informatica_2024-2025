package backend;

public class Elementare extends Scuola {

    private int contributoAnnualeStudente = 125;
    private int contributoAnnualeSede = 9000;

    public Elementare(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori, int contributoAnnualeStudente, int contributoAnnualeSede) {
        super(codiceAlfaNumerico, denominazione, indirizzo, citta, nStudenti, nClassi, nSediAggiuntive, nLaboratori);
        this.contributoAnnualeStudente = contributoAnnualeStudente;
        this.contributoAnnualeSede = contributoAnnualeSede;
    }

    @Override
    int getContributoTotale() {
        return getContributoStudenti() + getContributoSedi();
    }

    @Override
    int getContributoStudenti() {
        return getContributoAnnualeStudente() * nStudenti;
    }

    @Override
    int getContributoSedi() {
        return getContributoAnnualeSede() * nSediAggiuntive;
    }

    public int getContributoAnnualeStudente() {
        return contributoAnnualeStudente;
    }

    public int getContributoAnnualeSede() {
        return contributoAnnualeSede;
    }

    public void setContributoAnnualeStudente(int contributoAnnualeStudente) {
        this.contributoAnnualeStudente = contributoAnnualeStudente;
    }

    public void setContributoAnnualeSede(int contributoAnnualeSede) {
        this.contributoAnnualeSede = contributoAnnualeSede;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Contributo per gli studenti: %d Contributo per le sedi: %d", getContributoStudenti(), getContributoSedi());
    }
}