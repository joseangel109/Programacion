package Ej4;

import java.util.ArrayList;

public class Empresa {
    final String nombre;
    final String CIF;
    int telefono;
    String direccion;
    int empleados = 0;

    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

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

    public void añadirEmpleados(Empleado e) {
        listaEmpleados.add(e);
    }

    public void eliminarEmpleados(Empleado e) {
        listaEmpleados.remove(e);
    }

    public void mostrarEmpleados() {
        System.out.println(listaEmpleados.toString());
    }

    public void mostrarDNIsueldoByN() {

    }

    public void calcularBrutoTodos() {
        float sueldos = 0;
        for (Empleado empleado : listaEmpleados) {
                sueldos += empleado.sueldoBruto;
            }   
        System.out.println("Los sueldos brutos de los empleados " + sueldos);
    }

    public void calcularNetoTodos() {
        float sueldos = 0;
        for (Empleado empleado : listaEmpleados) {
                sueldos += empleado.calculaNeto(empleado.sueldoBruto);
            }   
        System.out.println("Los sueldos neto de los empleados " + sueldos);
    }
}
