package tema8.joseangel;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int m=Integer.parseInt(args[1]);
        int numeroVeces[] = new int[n];
        Arrays.fill(numeroVeces,m);//Con el .fill completamos la "tabla" numeroVeces es N
        for (int i = 0; i < numeroVeces.length; i++) {
            System.out.println(numeroVeces[i]);//Mostramos N
        }
    }
}
