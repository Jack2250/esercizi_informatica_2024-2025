public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto();

        punto1.setX(5);
        punto1.setY(2);
        System.out.println(punto1.toString());

        System.out.println("Il punto si trova: " + punto1.cercaQuadrante());

        punto1.setX(5);
        punto1.setY(-2);
        System.out.println(punto1.toString());

        System.out.println("Il punto si trova: " + punto1.cercaQuadrante());

        punto1.setX(-5);
        punto1.setY(-2);
        System.out.println(punto1.toString());

        System.out.println("Il punto si trova: " + punto1.cercaQuadrante());

        punto1.setX(-5);
        punto1.setY(2);
        System.out.println(punto1.toString());

        System.out.println("Il punto si trova: " + punto1.cercaQuadrante());

        Punto punto2 = new Punto();
        System.out.println(punto2.toString());

        /*Punto punto3 = new Punto(3,2);
        System.out.println(punto2.toString());*/
    }
}