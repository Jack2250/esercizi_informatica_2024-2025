public class Main {
    public static void main(String[] args) {

        Concessionaria c = new Concessionaria();
        Veicolo v1 = new Veicolo("Ford","Fiesta",3000);
        c.addVeicolo(v1);
        System.out.println(v1);
        System.out.println(c.numeroVeicoli());
    }
}