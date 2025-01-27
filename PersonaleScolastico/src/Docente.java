public class Docente extends Dipendente {
    private String ruolo;
    private String disciplina;

    public Docente(String nominativo, char genere, String indirizzo, String ruolo, String disciplina) {
        super(nominativo, genere, indirizzo);
        this.ruolo = ruolo;
        this.disciplina = disciplina;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public double getIncentivo() {
        return super.getIncentivo() * 2;
    }

    @Override
    public String toString() {
        return String.format("%s - %c - %s - %.2f - %s - %s", super.getNominativo(), super.getGenere(), super.getIndirizzo(), getIncentivo(), ruolo, disciplina);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String ritornaIndirizzoMaiuscolo() {
        //return indirizzo.toUpperCase();
        return getIndirizzo().toUpperCase();
    }
}