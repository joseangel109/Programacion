package Ej7;

public abstract class Propiedad extends Casilla {
    final int precio;
    final int hipoteca;
    private int propietario;

    abstract int getAlguiler(int modificacion);


    public Propiedad(String nombre, int codigo, int precio, int hipoteca, int propietario) {
        super(nombre, codigo);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = propietario;
    }



    public void mostrarPropietario() {
        System.out.println(propietario);
    }

}
