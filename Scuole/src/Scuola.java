public abstract class Scuola {
    String codiceAlfaNumerico;
    String denominazione;
    String indirizzo;
    String citta;
    int nStudenti;
    int nClassi;
    int nSediAggiuntive;
    int nLaboratori;

    protected Scuola(String codiceAlfaNumerico, String denominazione, String indirizzo, String citta, int nStudenti, int nClassi, int nSediAggiuntive, int nLaboratori) {
        this.codiceAlfaNumerico = codiceAlfaNumerico;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.nStudenti = nStudenti;
        this.nClassi = nClassi;
        this.nSediAggiuntive = nSediAggiuntive;
        this.nLaboratori = nLaboratori;
    }

    public String getCodiceAlfaNumerico() {
        return codiceAlfaNumerico;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public int getnStudenti() {
        return nStudenti;
    }

    public int getnClassi() {
        return nClassi;
    }

    public int getnSediAggiuntive() {
        return nSediAggiuntive;
    }

    public int getnLaboratori() {
        return nLaboratori;
    }

    public void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }

    public void setnClassi(int nClassi) {
        this.nClassi = nClassi;
    }

    public void setnSediAggiuntive(int nSediAggiuntive) {
        this.nSediAggiuntive = nSediAggiuntive;
    }

    public void setnLaboratori(int nLaboratori) {
        this.nLaboratori = nLaboratori;
    }
    abstract int getContributoTotale();
    abstract int getContributoStudenti();
    abstract int getContributoSedi();
    @Override
    public String toString(){
        return String.format("Codice alfa-numerico: %s Denominazione: %s Indirizzo: %s Città: %s Numero di studenti: %d Numero di classi : %d Numero di sedi aggiuntive: %d Numero di laboratori: %d",codiceAlfaNumerico,denominazione,indirizzo,citta,nStudenti,nClassi,nSediAggiuntive,nLaboratori);
    }
}