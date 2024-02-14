package Ej7;

public class Terreno extends Propiedad {
    private enum ColorTerreno {
        ROJO, AMARILLO, VERDE;
    }

    private int precioAlquiler;

    public Terreno(String nombre, int codigo, int precio, int hipoteca, int propietario, int precioAlquiler) {
        super(nombre, codigo, precio, hipoteca, propietario);
        this.precioAlquiler = precioAlquiler;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    int getAlguiler(int modificacion) {
        if (modificacion > 10)
            this.precioAlquiler = precioAlquiler * 10;
        else{
            this.precioAlquiler=(precioAlquiler*modificacion)+precioAlquiler;
        }
            return precioAlquiler;
    }

}
