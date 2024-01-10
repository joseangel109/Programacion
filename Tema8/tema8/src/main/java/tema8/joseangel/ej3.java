package tema8.joseangel;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         int menor=999999999    ;
         int mayor=0;
        int numeros[]; numeros = new int[10]; //Decimos que quiero un array de 10 numeros
        for (int i = 0; i < 10; i++) {  //Hacemos un bucle para pedirle los 10 numeros
            numeros[i]= teclado.nextInt();
            if(numeros[i]<menor){
                menor=numeros[i];
            }
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}
