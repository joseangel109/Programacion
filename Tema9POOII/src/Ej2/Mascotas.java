
package Ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Mascotas {
    String nombre;
    int edad;
    boolean estado;
    LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mascotas(String nombre, int edad, boolean estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        result = prime * result + (estado ? 1231 : 1237);
        result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mascotas other = (Mascotas) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        if (estado != other.estado)
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return " [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    public void muestra() {
        System.out.println(toString());
    }

    public void cumpleaños() {
        System.out.println(this.fechaNacimiento);
    }

    public void morir(boolean estado) {
        if (estado)
            System.out.println("Tu animal esta vivo");
        else
            System.out.println("Tu animal esta muerto");
    }

    public void habla() {
        System.out.println();
    }
}
