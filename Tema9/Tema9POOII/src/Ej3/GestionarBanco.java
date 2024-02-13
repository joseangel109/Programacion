package Ej3;

public class GestionarBanco {
    public static void main(String[] args) {
        CuentaAhorro ca=new CuentaAhorro("ES243635", 3000);
        CuentaCorriente cc= new CuentaCorriente("ES213454", 1000);
    cc.muestra();
    ca.muestra();
    System.out.println("");
    cc.ingresarDinero(1000, cc.saldo);
    ca.retirarDinero(400, ca.saldo);
    cc.muestra();
    ca.muestra();
    System.out.println("");
    
    }
}
