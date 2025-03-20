import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CorpoSolido> listaInterfacce = new ArrayList<>(); //Lista di interfacce

        Cubo c1 = new Cubo(7, 2);
        System.out.println(c1.peso());

        Sfera s1 = new Sfera(2, 2);
        System.out.println(s1.peso());

        listaInterfacce.add(c1); //Aggiungo un cubo alla lista di interfacce
        listaInterfacce.add(s1); //Aggiungo una sfera alla lista di interfacce

        listaInterfacce.forEach(System.out::println);

        for (CorpoSolido c : listaInterfacce) {
            if (c instanceof Validatore) {
                System.out.println("Ok tipo cubo, login!");
            } else {
                System.out.println("Login non concesso");
            }
        }
    }
}