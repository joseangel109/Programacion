package tema8.joseangel;
import java.util.Arrays;
import java.util.Scanner;
// Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
// primeros en un array y los 10 últimos en otro array. Por último, comparará ambos
// arrays y le dirá al usuario si son iguales o no.

public class Ej17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       System.out.println("Dame 20 numeros, los 10 primeros los guardo en un array y el resto en otros, los comparo y te digo si son iguales");
        int array1[]=new int [10];
        int array2[]=new int [10];
        System.out.println("Dame los 10 primeros numeros");
        for (int i = 0; i < array1.length; i++) {
            array1[i]= teclado.nextInt();
        }
        System.out.println("Ahora los del segundo grupo");
        for (int j = 0; j < array2.length; j++) {
            array2[j]= teclado.nextInt();
        }
        if(Arrays.equals(array1, array2))
        System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
    }
}   