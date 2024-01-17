package tema8.joseangel;

public class LineaFactura {
    public String descripcionProducto;
    public float precioUnitario;
    public int cantidadUnidades;
    public static int descuento = 5;
    public float importeTotalLinea = 0;

    public LineaFactura(String descripcionProducto, float precioUnitario, int cantidadUnidades, int importeTotalLinea) {
        this.descripcionProducto = descripcionProducto;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.importeTotalLinea = importeTotalLinea;
        if (cantidadUnidades >= 10) {
            descuento = 5;
            this.descuento = descuento;
        } else {
            descuento = 0;
            this.descuento = descuento;
        }

        importeTotalLinea = (int) ((cantidadUnidades * precioUnitario) - (cantidadUnidades * (100 / descuento)));
    }

    public LineaFactura() {
        // TODO Auto-generated constructor stub
    }

}
