public class Main {
    public static void main(String[] args) {
        Concessionaria c = new Concessionaria();
        Veicolo v1 = new Veicolo("Ford", "Fiesta", 3000);
        Automobile a1 = new Automobile("Ford", "Fiesta", 3000, 3);
        Moto m1 = new Moto("Suzuki", "TTT", 1200, 500);
        c.addveicolo(a1);
        c.addveicolo(v1);
        c.addveicolo(m1);
        System.out.println("Ci sono " + c.numeroVeicoli());
        c.stampaVeicoli();
        c.modificaVeicolo();
        c.eliminaVeicolo();
        c.stampaVeicoli();
    }
}