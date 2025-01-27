public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente("Giuseppe",'M',"Via dei Pini");
        System.out.println(d1);
        Docente d2 = new Docente("Enrico",'M',"Viale dei Mille","ITP","Informatica");
        System.out.println(d2);
        System.out.println(d2.ritornaIndirizzoMaiuscolo());
        Dipendente d3 = new Docente("Enrico",'M',"Viale dei Mille","ITP","Informatica");
        System.out.println(d3.getIncentivo());
        Impiegato d4 = new Impiegato("Rodolfo",'F',"Brontolo","trabajo");
        System.out.println(d4);
        Dipendente d5 = new Impiegato("Rodolfo",'F',"Brontolo","trabajo");
        System.out.println(d5.getIncentivo());
    }
}