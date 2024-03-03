import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej4 {
    // Implementa un programa que cree un vector de enteros de tamaño N (número
    // aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le
    // preguntará
    // al usuario qué posición del vector quiere mostrar por pantalla, repitiéndose
    // una y
    // otra vez hasta que se introduzca un valor negativo. Maneja todas las posibles
    // excepcione
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posicion;

        try {
            int tamañoVector = ThreadLocalRandom.current().nextInt(100);
            int[] vector = new int[tamañoVector];

            for (int i = 0; i < tamañoVector; i++) {
                vector[i] = ThreadLocalRandom.current().nextInt(10);
            }
            System.out.println("Vector generado de tamaño " + tamañoVector + " con valores aleatorios entre 1 y 10.");
            do {
                System.out.print("Ingrese la posición del vector que desea mostrar (negativo para salir): ");
                posicion = teclado.nextInt();

                if (posicion >= 0 && posicion < tamañoVector) {
                    System.out.println("Valor en la posición " + posicion + ": " + vector[posicion]);
                } else if (posicion >= tamañoVector) {
                    System.out.println("Error: La posición está fuera del rango del vector.");
                }

            } while (posicion >= 0);

        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un numero entero positivo.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Numero fuiera de rango.");
        }
    }
}
