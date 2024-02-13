package Ej4;

public class Empleado {
    final String nombre;
    final String dni;
    float sueldoBruto;
    int edad;
    int telefono;
    String direccion;

    public Empleado(String nombre, String dni, float sueldoBruto, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + Float.floatToIntBits(sueldoBruto);
        result = prime * result + edad;
        result = prime * result + telefono;
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
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
        Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (Float.floatToIntBits(sueldoBruto) != Float.floatToIntBits(other.sueldoBruto))
            return false;
        if (edad != other.edad)
            return false;
        if (telefono != other.telefono)
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", dni=" + dni + ", sueldoBruto=" + sueldoBruto + ", edad=" + edad
                + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }

    public void muestra() {
        System.out.println(toString());
    }

    public float calculaNeto(float sueldoBruto) {
        int irpf = 0;
        float sueldoAnual = sueldoBruto * 12;
        if (sueldoAnual < 12000)
            irpf = 20;
        if (sueldoAnual > 12000 && sueldoAnual < 25000)
            irpf = 30;
        else
            irpf = 40;

        float sueldoNeto = sueldoBruto - ((sueldoBruto * irpf) / 100);
        return sueldoNeto;
    }

}
