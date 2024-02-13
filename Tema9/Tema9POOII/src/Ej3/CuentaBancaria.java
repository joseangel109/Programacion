package Ej3;

import java.util.Scanner;

public abstract class CuentaBancaria {
    Scanner teclado = new Scanner(System.in);
    String iban;
    double saldo;
    float interesAnuealBasico=2.5;
    
    
    @Override
    public String toString() {
        return "CuentaBancaria [iban=" + iban + ", saldo=" + saldo + ", interesAnuealBasico=" + interesAnuealBasico
                + "]";
    }

    //Constructor
    public CuentaBancaria(String iban, double saldo) {
        if(this.saldo<0){
        this.iban = iban;
        this.saldo = saldo;
        }
    }
    
    //Getters and setters
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getInteresAnuealBasico() {
        return interesAnuealBasico;
    }
    public void setInteresAnuealBasico(double interesAnuealBasico) {
        this.interesAnuealBasico = interesAnuealBasico;
    }
    public void mostrarMenu() {
        System.out.println("Elige una opcion");
        System.out.println("1) Consultar los datos");
        System.out.println("2) Ingresar dinero");
        System.out.println("3) Retirar dinero");
        System.out.println("4) Transferencia");
    }
    public void consultarAtributos(String isbn, double saldo) {
        System.out.println("Tu ISBN es: "+ isbn + " y tienes "+ saldo+" euros");
    }

    public void ingresarDinero(Scanner teclado, double saldo) {
        System.out.println("Cuanto dinero quieres añadir");
        float cantidad=teclado.nextFloat();
        saldo+=cantidad;
        System.out.println("Tu nuevo saldo es: "+saldo);
    }

    public void retirarDinero(Scanner teclado, double saldo) {
        System.out.println("Cuanto dinero quieres retirar");
        float cantidad=teclado.nextFloat();
        saldo-=cantidad;
        System.out.println("Tu nuevo saldo es: "+saldo);
    }

    public void transferencia(Scanner teclado, CuentaBancaria cc ) {
        System.out.println("Cuanto dinero quieres para pasar de una cuenta a otra?");
        int cantidad=teclado.nextInt();
        cc.ingresarDinero(cantidad, saldo);
        this.retirarDinero(cantidad, saldo);
    }
    public abstract void muestra();

    public void calcularInteres(){
        
    }
}
