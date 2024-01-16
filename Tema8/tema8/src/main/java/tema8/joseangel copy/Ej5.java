package tema8.joseangel;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Dame 20 numeros y te doy la media");
         Scanner teclado=new Scanner(System.in);
         int contador=0;
         int suma=0;
        int numeros[]; numeros = new int[20];//Le pedimos los 20 numeros 
        for (int i = 0; i < 20; i++) {
            numeros[i]= teclado.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {//Recorremos el array para hacer la suma y contar los caracteres que tiene en el array
                contador+=1;
                suma=suma+numeros[i];
        }
        System.out.println("La media es: "+suma/contador);       
    }
            
    }
