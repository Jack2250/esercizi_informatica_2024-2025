public class Elementare extends Scuola {

    private int contributoAnnualeStudente = 125;
    private int contributoAnnualeSede = 9000;

    public Elementare(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
        super(codiceAlfaNumerico, denominazione, indirizzo, citta, nStudenti, nClassi, nSediAggiuntive, nLaboratori);
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
    public int getContributo() {
        return  (getContributoAnnualeStudente() * nStudenti) + (getContributoAnnualeSede() * nSediAggiuntive);
    }

}