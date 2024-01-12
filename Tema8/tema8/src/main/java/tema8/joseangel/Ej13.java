package tema8.joseangel;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero para empezar");
        int numero = teclado.nextInt();
        System.out.println("Dime un numero para saltar");
        int numeroSalto = teclado.nextInt();
        System.out.println("Dime un numero para terminar");
        int numeroFin = teclado.nextInt();
        int num[] = new int[numeroFin];
        for (int i = 0; i < num.length; i++) {
            num[i]=numero;
            numero=numero+numeroSalto;
            System.out.print(num[i] + " ");
        }
    }
}   