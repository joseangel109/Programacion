package tema8.joseangel;
import java.util.Arrays;
import java.util.Scanner;
// Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios
// entre 0 y 9. Luego ordena los valores del array y los mostrará por pantalla.
public class Ej18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int array[]= new int [30];
       for (int i = 0; i < array.length; i++) {
        array[i]=(int) (Math.random()*9)+1;
    }
       Arrays.sort(array);
       for (int i : array) {
        System.out.println(i);
       }
    }
}   