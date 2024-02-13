package Ej4;

public class Programa {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("pedro", "13456", 1000, 0, 98640, "ujhgfvdsawdtyhgdfs");
        Empleado empleado2= new Empleado("daniel", "9876543", 2220, 0, 85430, "jkhgfdshgfds");
        Empresa empresa1=new Empresa("IES", "98765", 234567, "ivdffergfdgffdrggfrdgfra", 2);
        Empresa empresa2=new Empresa("mondongo", "12345678", 876543, "jononwrihgoña", 10);

        empresa1.añadirEmpleados(empleado1);
        empresa1.mostrarEmpleados();
        empresa1.eliminarEmpleados(empleado1);
        empresa1.mostrarEmpleados();
        empresa1.añadirEmpleados(empleado1);
        empresa1.añadirEmpleados(empleado2);
        empresa1.mostrarEmpleados();
        System.out.println("/////////////////////////////////");
        empresa1.calcularBrutoTodos();
        System.out.println("/////////////////////////////////");
        empresa1.calcularNetoTodos();

    }
}
