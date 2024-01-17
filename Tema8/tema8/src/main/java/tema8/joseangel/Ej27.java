package tema8.joseangel;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        System.out.println("Dime un numero y te digo los divisores");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        System.out.println("Divisores de " + numero + ": " + encontrarDivisores(numero));
    }

    public static ArrayList<Integer> encontrarDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}