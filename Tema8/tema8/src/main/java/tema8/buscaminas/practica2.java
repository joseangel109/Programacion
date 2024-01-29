package tema8.buscaminas;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {

        // Pedimos al usuario el tamaño del tablero
        System.out.println("Introduce el número de filas del tablero:");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("Introduce el número de columnas del tablero:");
        int columnas = new Scanner(System.in).nextInt();

        // Creamos el tablero
        int[][] tablero = crearTablero(filas, columnas, 10);

        // Mostramos el tablero sin pistas
        mostrarMatriz(tablero, true);

        // Bucle principal del juego
        while (true) {

            // Pedimos al usuario la fila y la columna de la siguiente tirada
            System.out.println("Introduce la fila de la siguiente tirada:");
            int fila = new Scanner(System.in).nextInt();
            System.out.println("Introduce la columna de la siguiente tirada:");
            int columna = new Scanner(System.in).nextInt();

            // Realizamos la tirada
            boolean tocado = tirada(tablero, fila, columna);

            // Si la tirada ha tocado una mina, terminamos el juego
            if (tocado) {
                System.out.println("Has tocado una mina. ¡Has perdido!");
                break;
            }

            // Si la tirada ha descubierto un 0, revelamos las casillas adyacentes
            if (tablero[fila][columna] == 0) {
                revelarCasillasAdyacentes(tablero, fila, columna);
            }

            // Mostramos el tablero con las pistas
            mostrarMatriz(tablero, false);

            // Comprobamos si el jugador ha ganado
            if (ganado(tablero)) {
                System.out.println("¡Has ganado!");
                break;
            }
        }
    }

    // Función para revelar las casillas adyacentes a una casilla
    public static void revelarCasillasAdyacentes(int[][] tablero, int fila, int columna) {

        // Recorremos las casillas adyacentes
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {

                // Si la casilla está dentro del tablero y no está revelada
                if (i >= 0 && i < tablero.length && j >= 0 && j < tablero[0].length && tablero[i][j] == -2) {

                    // Revelamos la casilla
                    tablero[i][j] = tablero[fila][columna];

                    // Si la casilla revelada es un 0, revelamos las casillas adyacentes a ella
                    if (tablero[i][j] == 0) {
                        revelarCasillasAdyacentes(tablero, i, j);
                    }
                }
            }
        }
    }

    // Crea una matriz nxm de enteros, cuyos valores serán 0 o -1 si tiene o no
    // tiene una mina
    public static int[][] crearTablero(int n, int m, int minas) {

        // Creamos la matriz de enteros
        int[][] tablero = new int[n][m];

        // Rellenamos la matriz con 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tablero[i][j] = 0;
            }
        }

        // Colocamos las minas en la matriz
        for (int i = 0; i < minas; i++) {
            int fila = (int) (Math.random() * n);
            int columna = (int) (Math.random() * m);

            // Si la casilla ya tiene una mina, no la colocamos
            while (tablero[fila][columna] == -1) {
                fila = (int) (Math.random() * n);
                columna = (int) (Math.random() * m);
            }

            tablero[fila][columna] = -1;
        }

        return tablero;
    }

    // Devuelve verdadero si en la posición de la matriz hay un -1 o falso si hay un
    // 0. Si hay un 0 cambiará su valor por un -2.
    public static boolean tirada(int[][] tablero, int fila, int columna) {

        // Comprobamos si la posición está dentro de la matriz
        if (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero[0].length) {
            return false;
        }

        // Comprobamos si la casilla contiene una mina
        if (tablero[fila][columna] == -1) {
            return true;
        }

        // Cambiamos el valor de la casilla por un -2
        tablero[fila][columna] = -2;

        return false;
    }

    // Muestra la matriz completa o mostrará si es 0 o -1 un espacio en blanco y si
    // es un -2 mostrará una X. Haz que la matriz se vea de forma correcta en
    // formato filas y columnas.
    public static void mostrarMatriz(int[][] tablero, boolean mostrarTodas) {

        // Recorremos la matriz
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {

                // Si mostramos todas las casillas, las mostramos tal cual
                if (mostrarTodas) {
                    System.out.print(tablero[i][j]);
                } else {

                    // Si la casilla es 0 o -1, la mostramos como un espacio en blanco
                    if (tablero[i][j] == 0 || tablero[i][j] == -1) {
                        System.out.printf("%3d");
                    } else {

                        // Si la casilla es -2, la mostramos como una X
                        System.out.print("X");
                    }
                }
            }
            System.out.println();
        }
    }

    // Función para comprobar si el jugador ha ganado
    public static boolean ganado(int[][] tablero) {

        // Contamos el número de casillas que no están reveladas
        int casillasNoReveladas = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == -2) {
                    casillasNoReveladas++;
                }
            }
        }

        // Si no quedan casillas no reveladas, el jugador ha ganado
        return casillasNoReveladas == 0;
    }
}