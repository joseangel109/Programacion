package Ej7;

public class Estaciones extends Propiedad {

    private static final int VALOR_ESTACION = 20000;

    public Estaciones(String nombre) {
        super(nombre, VALOR_ESTACION, VALOR_ESTACION);
    }

    @Override
    protected int getAlguiler(int modificacion) {
        return this.precio / modificacion;
    }

}
