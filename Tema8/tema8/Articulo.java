package tema8.joseangel;

// Clase ‘Articulo’
// • Un artículo tiene un identificador (número entero), un nombre, un precio de
// venta a cliente, un precio de compra a proveedor, un IVA (%) y un stock
// (representa la cantidad de ese artículo disponible en tienda). El nombre y el
// identificador de un artículo no pueden cambiar. El identificador ha de establecerse
// automáticamente y ser único, podemos llevar un contador de los objetos creados y
// así el identificador será único. El IVA es el mismo para todos los artículos (un 21%).
// Tanto el precio de compra como el precio de venta han de ser valores superiores a
// cero. El precio de venta ha de ser superior al precio de compra. El stock ha de ser
// superior o igual a cero.
// • Deberá tener un único constructor así como todos los getters y setters que sea
// posible.
// • Deberá tener al menos dos métodos públicos, uno para vender (a cliente) y otro
// para comprar (a proveedor). En ambos casos deberá pasarse un único argumento
// con la cantidad de unidades a vender o comprar, y se devolverá un valor indicando
// si fue posible realizar la operación o no. Si la operación se puede realizar, se
// deberá modificar el stock del artículo.
// • Deberá tener un método público que devuelva una cadena de texto de una sola
// línea con la información sobre dicho artículo: id, nombre, precios, IVA y stock.
// • En los casos en los que sea necesario, los métodos públicos mostrarán un
// mensaje por System.err si no es posible realizar la operación solicitada.
// • Pueden implementarse otros métodos si se considera necesario.
// • Es obligatorio que esta clase no realice ningún tipo de entrada por teclado ni
// salida por pantalla (Excepto los mencionados mensajes de error)
class Articulo {
    private static int contadorArticulos = 1;

    private final int id;
    private final String nombre;
    private double precioVenta;
    private double precioCompra;
    private final double iva;
    private int stock;

    public Articulo(String nombre, double precioVenta, double precioCompra, int stock) {
        this.id = contadorArticulos++;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.iva = 0.21;
        this.stock = stock;

        if (precioVenta <= 0 || precioCompra <= 0 || precioVenta <= precioCompra || stock < 0) { // Comprobamos que los
                                                                                                 // datos introducidos
                                                                                                 // sean validos
            System.err.println("Error: Datos de artículo no válidos.");
        }
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getIva() {
        return iva;
    }

    public int getStock() {
        return stock;
    }

    public boolean vender(int cantidad) {// Manejamos el Stock
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            System.err.println("Error: No hay suficiente stock para la venta.");
            return false;
        }
    }

    public void setPrecioVenta(double precioVenta) {// Cuanto nos cuesta la venta
        if (precioVenta > 0) {
            this.precioVenta = precioVenta;
        } else {
            System.err.println("Error: Precio de venta no válido.");
        }
    }

    public void setPrecioCompra(double precioCompra) {// Cuanto nos cuesta la compra
        if (precioCompra > 0) {
            this.precioCompra = precioCompra;
        } else {
            System.err.println("Error: Precio de compra no válido.");
        }
    }

    public void setStock(int stock) {// Stock Negativo
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.err.println("Error: Stock no válido.");
        }
    }

    public boolean comprar(int cantidad) {// Si quieren comprar mas del stock que hay
        if (cantidad > 0) {
            stock += cantidad;
            return true;
        } else {
            System.err.println("Error: Cantidad de compra no válida.");
            return false;
        }
    }

    public String obtenerInformacion() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio Venta: " + precioVenta +
                ", Precio Compra: " + precioCompra + ", IVA: " + iva * 100 + "%, Stock: " + stock;
    }
}