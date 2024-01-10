package tema8.joseangel;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
        System.out.println("Dame el valor de N");//Pedimos N que es el numero de veces que queremos que aparezca
        int n=teclado.nextInt();
        System.out.println("Dame el valor de M");//Pedimos M que es el numero que queremos que se repita
        int m=teclado.nextInt();
        int numeroVeces[] = new int[n];
        Arrays.fill(numeroVeces,m);//Con el .fill completamos la "tabla" numeroVeces es N
        for (int i = 0; i < numeroVeces.length; i++) {
            System.out.println(numeroVeces[i]);//Mostramos N
        }
    }
}
