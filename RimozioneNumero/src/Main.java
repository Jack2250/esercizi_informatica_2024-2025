import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int n;
        int[] vettore = {1, 4, 6, 1, 7, 8, 9, 10, 1};

        System.out.println("Che numero vuoi rimuovere dal vettore");
        n = tastiera.nextInt();

        int[] newVettore = removeNum(vettore, n);

        for (int i : newVettore) {
            System.out.println("" + i);
        }

        if(test(vettore,n)==true){
            System.out.println("Il metodo funziona");
        }else{
            System.out.println("Il metodo non funziona");
        }
    }

    public static int[] removeNum (int[] array, int n) {
        int cont = 0;
        int[] newArray = null;

        for(int i = 0; i < array.length; i++) {
            if(array[i] != n) {
                cont++;
            }
        }

        if(cont > 0) {
            newArray = new int[cont];
            int j = 0;

            for(int i = 0; i < array.length; i++) {
                if(array[i] != n){
                    newArray[j++] = array[i];
                }
            }
        }
        return newArray;
    }

    public static boolean test(int[] array, int n) {
        boolean funziona=true;
        try
        {
            removeNum(array, n);
        }catch (Exception e)
        {
            funziona=false;
        }
        return funziona;
    }
}