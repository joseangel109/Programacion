package tema8.joseangel;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numeros[]; numeros = new int[10]; //Decimos que quiero un array de 10 numeros
        for (int i = 0; i < 10; i++) {  //Hacemos un bucle para pedirle los 10 numeros
            numeros[i]= teclado.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i]); //Muestro los numeros
        }

    }
}
