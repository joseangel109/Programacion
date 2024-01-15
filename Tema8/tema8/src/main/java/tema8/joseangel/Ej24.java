package tema8.joseangel;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
// “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
// teclado y luego el programa mostrará la nota mínima, máxima y media de cada
// alumno
public class Ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz[][] = new double[4][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Alumno " + (i + 1) + " dame la nota de la asignatura " + (j + 1));
                matriz[i][j] = teclado.nextDouble();
            }
            Arrays.sort(matriz[i]);
        }
    }
}