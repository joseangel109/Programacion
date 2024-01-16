package tema8.joseangel;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Dame 20 numeros y te doy la media");
         Scanner teclado=new Scanner(System.in);
         int contNeg=0;
         int contPos=0;
         int sumaNeg=0;
         int sumaPos=0;
        int numeros[]; numeros = new int[20];//Le pedimos los 20 numeros 
        for (int i = 0; i < 20; i++) {//Pedimos los nums
            numeros[i]= teclado.nextInt();
            if(numeros[i]<0){//Si es negativo sumamos el contador y la suma de los negs
                contNeg+=1;
                sumaNeg=sumaNeg+numeros[i];
            }
            if(numeros[i]>0){//Lo mismo con los positivos
                contPos+=1;
                sumaPos=sumaPos+numeros[i];
            }
        }
           System.out.println("La media de los positivos es: "+sumaPos/contPos); 
           System.out.println("La media de los negativos es: "+sumaNeg/contNeg);
    }
}
