import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean esci = true;
        Scanner tastiera = new Scanner(System.in);
        int n=0,n2=0;

        /*do{
            try{
                System.out.println("Inserisci due numeri");
                n = tastiera.nextInt();
                n2 = tastiera.nextInt();
                n = n /n2;
                System.out.println("La divisione è:" + n);
                esci = true;
            }catch(ArithmeticException e){
                System.out.println(e.toString());
                esci = false;
            }
        }while(esci==false);*/

        do{
        try {
            System.out.println("Inserisci un numero");
            n = tastiera.nextInt();
            System.out.println("Inserisci un numero");
            n2 = tastiera.nextInt();
            n = controlloDivisione(n,n2);
            System.out.println("La divisione è " + n);
        } catch (Exception e) {
            System.out.println("Problema con numero inserito");
            System.out.println(e.getMessage());
        }
    }while(esci==false);
    }
    public static int controlloDivisione (int a, int b) throws Exception {
        if (b > 0){
            return a/b;
        } else
        {
            throw new Exception("Divisione impossibile");
        }
    }
}
