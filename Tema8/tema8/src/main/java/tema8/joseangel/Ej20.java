package tema8.joseangel;
import java.util.Arrays;
import java.util.Scanner;
// Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
// aleatorios entre 0 y 99. Luego pedirá por teclado un valor N y se mostrará por pantalla
// si N existe en el array, además de cuantas veces
public class Ej20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador=0;
     int array[]=new int[1000];
     for (int i = 0; i < array.length; i++) {
        array[i]=(int)(Math.random()*100);
     }
     System.out.println("Dame un valor n");
     int numeroN=teclado.nextInt();
    for (int i = 0; i < array.length; i++) {
        if(array[i]==numeroN){
            contador++;
        }
    }
     if (contador>0);{
        System.out.println("El numero introducido aparece "+contador);
     }
    }
}   