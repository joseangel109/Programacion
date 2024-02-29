import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
//Implementa un programa que pida al usuario un valor entero A utilizando un
// nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido:
// …”. Se deberá tratar la excepción InputMismatchException que lanza nextInt()
// cuando no se introduce un entero válido. En tal caso se mostrará el mensaje “Valor
// introducido incorrecto”.
public static void main(String[] args) throws Exception {
    Scanner teclado= new Scanner(System.in);
    System.out.println("Dime un numero entero");
    int num=teclado.nextInt();
    if(num<0) throw new InputMismatchException("Valor introducido incorrecto");
    else System.out.println("Valor introducido: "+num);
    
}
}
