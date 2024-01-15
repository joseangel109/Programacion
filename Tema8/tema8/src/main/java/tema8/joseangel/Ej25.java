package tema8.joseangel;

import java.util.Scanner;

public class Ej25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = teclado.nextInt();
        int[][] matriz = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese información para la persona " + (i + 1));
            System.out.print("Género (0 para varón, 1 para mujer): ");
            matriz[i][0] = teclado.nextInt();
            System.out.print("Sueldo: ");
            matriz[i][1] = teclado.nextInt();
        }

        double sueldoPromedioVarones = calcularSueldoPromedio(matriz, 0);
        double sueldoPromedioMujeres = calcularSueldoPromedio(matriz, 1);

        System.out.println("Sueldo promedio de varones: " + sueldoPromedioVarones);
        System.out.println("Sueldo promedio de mujeres: " + sueldoPromedioMujeres);

        double brechaSalarial = sueldoPromedioMujeres - sueldoPromedioVarones;
        System.out.println("Brecha salarial: " + brechaSalarial);
    }

    private static double calcularSueldoPromedio(int[][] matriz, int genero) {
        int totalPersonas = 0;
        int totalSueldos = 0;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == genero) {
                totalPersonas++;
                totalSueldos += matriz[i][1];
            }
        }

        return (totalPersonas > 0) ? (double) totalSueldos / totalPersonas : 0;
    }
}
