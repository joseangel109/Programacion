package tema8.joseangel;

import java.util.Arrays;
import java.util.Scanner;

public class Ej16 {
    public class Ejercicio16 {
        public void main(String[] args) {
            // Calculamos cuantos números tiene la secuencia
            int cuantos = 0;
            for (int i = 1; i <= 10; i++) {
                cuantos += i;
            }
            // Creamos elvector
            int valores[] = new int[cuantos];
            // Posicion donde insertar los números
            int pos = 0;
            // Para cada número n del 1 al 10
            for (int n = 1; n < 10; n++) {
                // introducimos n veces 'n' en la posición 'pos'
                Arrays.fill(valores, pos, pos + n, n);
                // Actualizamos pos
                pos += n;
            }
            // Mostrar el array
            String arrayStr = Arrays.toString(valores);
            System.out.println("Array: " + arrayStr);

        }
    }
}