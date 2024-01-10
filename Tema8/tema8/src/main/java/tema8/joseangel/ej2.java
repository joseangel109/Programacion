package tema8.joseangel;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int suma=0;
        System.out.println("Dame 10 numeros y te doy la suma");
         Scanner teclado=new Scanner(System.in);
        int numeros[]; numeros = new int[10];//Le pedimos los 10 numeros 
        for (int i = 0; i < 10; i++) {
            numeros[i]= teclado.nextInt();
            suma=numeros[i]+suma;//Sumamos los numeros
        }
           System.out.println(suma); 
    }
}
