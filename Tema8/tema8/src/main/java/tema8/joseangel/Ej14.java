package tema8.joseangel;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int [] numeros = new int[55];
       int contador=0;
       for (int i = 1; i <=10; i++) {
        for (int j = 0; j < i; j++) {
            numeros[contador]=i;
            contador++;            
        }
        
       }
       for (int i : numeros) {
        System.out.print(i+" ");
       }
    }
}   