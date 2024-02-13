package Ej4;

import java.util.ArrayList;

public class Empresa {
    final String nombre;
    final String CIF;
    int telefono;
    String direccion;
    int empleados = 0;

    static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Empresa(String nombre, String cIF, int telefono, String direccion, int empleados) {
        this.nombre = nombre;
        CIF = cIF;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", CIF=" + CIF + ", telefono=" + telefono + ", direccion=" + direccion
                + ", empleados=" + empleados + "]";
    }

    public static void añadirEmpleados(Empleado e) {
        listaEmpleados.add(e);
    }

    public static void eliminarEmpleados(Empleado e) {
        listaEmpleados.remove(e);
    }

    public static void mostrarEmpleados() {
        System.out.println(listaEmpleados.toString());
    }

    public void mostrarDNIsueldoByN() {

    }

    public void calcularBrutoTodos(ArrayList<Empleado> listaEmpleados) {
        float sueldos = 0;
        for (int i = 0; i < array.length; i++) {
            sueldos += Empleado.sueldoBruto;
        }
        System.out.println("Los sueldos brutos de los empleados " + sueldos);
    }

    public void calculaNetoTodos(ArrayList<Empleado> listaEmpleados) {
        float sueldos = 0;
        for (int i = 0; i < array.length; i++) {
            sueldos += Empleado.sueldoNeto;
        }
        System.out.println("Los sueldos netos de los empleados " + sueldos);
    }
}
