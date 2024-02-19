package Maraton;

import java.util.Scanner;

public class Programa{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Triangulo triangulo1=new Triangulo(10, 10);        
        System.out.println("Dime que tipo de triangulo es");
        triangulo1.estilo=teclado.nextLine();
        triangulo1.verDim();
        System.out.println("----------------------------");
        triangulo1.area();
        System.out.println("----------------------------");
        triangulo1.verEstilo();
    }
}
