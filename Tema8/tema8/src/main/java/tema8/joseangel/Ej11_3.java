package tema8.joseangel;

import java.util.concurrent.ThreadLocalRandom;

public class Ej11_3 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int tresDeCero=0;
        int tresDeUno=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=ThreadLocalRandom.current().nextInt(0,2);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
              System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
          }

        //Filas
        if (matriz[0][0]==0 && matriz[0][1]==0 && matriz[0][2]==0)
        tresDeCero++;
        if (matriz[1][0]==0 && matriz[1][1]==0 && matriz[1][2]==0)
        tresDeCero++;
        if (matriz[2][0]==0 && matriz[2][1]==0 && matriz[2][2]==0)
        tresDeCero++;
        if (matriz[0][0]==1 && matriz[0][1]==1 && matriz[0][2]==1)
        tresDeUno++;
        if (matriz[1][0]==1 && matriz[1][1]==1 && matriz[1][2]==1)
        tresDeUno++;
        if (matriz[2][0]==1 && matriz[2][1]==1 && matriz[2][2]==1)
        tresDeUno++;
        //Columna
        if (matriz[0][0]==0 && matriz[1][0]==0 && matriz[2][0]==0)
        tresDeCero++;
        if (matriz[0][1]==0 && matriz[1][1]==0 && matriz[2][1]==0)
        tresDeCero++;
        if (matriz[0][2]==0 && matriz[1][2]==0 && matriz[2][2]==0)
        tresDeCero++;
        if (matriz[0][0]==1 && matriz[1][0]==1 && matriz[2][0]==1)
        tresDeUno++;
        if (matriz[0][1]==1 && matriz[1][1]==1 && matriz[2][1]==1)
        tresDeUno++;
        if (matriz[0][2]==1 && matriz[1][2]==1 && matriz[2][2]==1)
        tresDeUno++;
        //Diagonales
        if (matriz[0][0]==0 && matriz[1][1]==0 && matriz[2][2]==0)
        tresDeCero++;
        if (matriz[2][0]==0 && matriz[1][1]==0 && matriz[0][2]==0)
        tresDeCero++;
        if (matriz[0][0]==1 && matriz[1][1]==1 && matriz[2][2]==1)
        tresDeUno++;
        if (matriz[2][0]==1 && matriz[1][1]==1 && matriz[0][2]==1)
        tresDeUno++;
        System.out.println("Han salido "+tresDeCero+" tres en raya con 0");
        System.out.println("Han salido "+tresDeUno+" tres en raya de 1");
    }
}
