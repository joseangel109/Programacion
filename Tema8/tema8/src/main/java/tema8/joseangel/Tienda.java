package tema8.joseangel;

import java.util.ArrayList;
import java.util.Scanner;

// Clase ‘Tienda’
// • Contendrá la función ‘main’ del programa.
// • Al iniciar el programa se mostrará por pantalla un menú principal con las
// siguientes opciones:
// 1. Mostrar artículos.
// 2. Venta a cliente.
// 3. Compra a proveedor.
// 4. Gestionar artículos.
// 5. Salir.
// • La opción 1 mostrará por pantalla la descripción de todos los artículos de la
// tienda.
// • La opción 2 permitirá realizar una venta. Pedirá los identificadores y cantidades
// de los artículos deseados además del nombre del cliente. Mostrará el precio total y
// pedirá confirmar la venta.
// • La opción 3 permitirá realizar una compra. Pedirá los identificadores y cantidades
// de los artículos deseados además del nombre del proveedor. Mostrará el precio
// total y pedirá confirmar la compra.
// • La opción 4 mostrará un submenú con cuatro opciones: ‘1. Añadir artículo’, ‘2.
// Editar artículo’, ‘3. Eliminar artículo’ y ‘4. Volver’. Las tres primeras opciones pedirán
// introducir la información necesaria y realizarán la operación si es posible. La
// cuarta opción volverá al menú principal.
// • La opción 5 termina el programa.
// •El menú principal y el submenú se volverán a mostrar tras cada operación hasta
// que el usuario elija ‘Salir’ o ‘Volver’ según el caso.
// • Toda interacción con el usuario deberá realizarse por entrada y salida estándar
// (teclado y pantalla).
// • Los artículos deberán almacenarse en memoria en alguna estructura de datos. 
// • Deberán manejarse los posibles errores y que puedan producirse.
// • No programes todo directamente en la función main. Implementa distintas
// funciones adicionales para que el código sea lo más modular.
// • Es obligatorio utilizar la clase ‘Articulo’.

class Tienda {
    private static ArrayList<Articulo> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do { // BUCLE PARA MOSTRAR MENU
            mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarArticulos();
                    break;
                case 2:
                    realizarVenta();
                    break;
                case 3:
                    realizarCompra();
                    break;
                case 4:
                    gestionarArticulos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.err.println("Error: Opción no válida. Introduce un número del 1 al 5.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("----- Menú Principal -----");
        System.out.println("1. Mostrar artículos.");
        System.out.println("2. Venta a cliente.");
        System.out.println("3. Compra a proveedor.");
        System.out.println("4. Gestionar artículos.");
        System.out.println("5. Salir.");
        System.out.print("Selecciona una opción: ");
    }

    private static void mostrarArticulos() {
        if (inventario.isEmpty()) { // Miramos la lista de inventario, si esta vacia muestra el mensaje
            System.out.println("No hay artículos en la tienda.");
        } else { // Sino hacemos un foreach para recorrer toda la lista y mostrar los articulo
            System.out.println("----- Artículos en la Tienda -----");
            for (Articulo articulo : inventario) {
                System.out.println(articulo.obtenerInformacion());
            }
        }
    }

    private static void realizarVenta() { // Venta a Cliente
        mostrarArticulos();
        System.out.print("Introduce el ID del artículo a vender: "); // El ID es la posicion del producto
        int idArticulo = scanner.nextInt();
        System.out.print("Introduce la cantidad a vender: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorId(idArticulo); // Llamamos a otra funcion para que busque el producto para
                                                             // comprobar si tenemos en stocj

        if (articulo != null && articulo.vender(cantidad)) {// Si el articulo existe y tenemos stock se saca el precio
                                                            // de la compra
            double totalVenta = cantidad * articulo.getPrecioVenta();
            System.out.println("Venta realizada. Precio total: " + totalVenta);
        } else {
            System.err.println("Error: No se pudo realizar la venta.");
        }
    }

    private static void realizarCompra() { // Lo mismo que hacemos con la venta
        mostrarArticulos();
        System.out.print("Introduce el ID del artículo a comprar: ");
        int idArticulo = scanner.nextInt();
        System.out.print("Introduce la cantidad a comprar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        // ANOTACION SEGURO QUE SE PODRIA HACER DE OTRA MANERA USANDO LA FUNCION
        // ANTERIOR PERO NO SABIA COMO HACERLO
        Articulo articulo = buscarArticuloPorId(idArticulo);

        if (articulo != null && articulo.comprar(cantidad)) {
            double totalCompra = cantidad * articulo.getPrecioCompra();
            System.out.println("Compra realizada. Precio total: " + totalCompra);
        } else {
            System.err.println("Error: No se pudo realizar la compra.");
        }
    }

    private static void gestionarArticulos() {
        int opcion;
        do { // Un bucle para mostrar el submenu, hasta que pulse 4 para salir
            mostrarMenuGestionArticulos();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    editarArticulo();
                    break;
                case 3:
                    eliminarArticulo();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.err.println("Error: Opción no válida. Introduce un número del 1 al 4.");
            }
        } while (opcion != 4);
    }

    private static void mostrarMenuGestionArticulos() {
        System.out.println("----- Gestionar Artículos -----");
        System.out.println("1. Añadir artículo.");
        System.out.println("2. Editar artículo.");
        System.out.println("3. Eliminar artículo.");
        System.out.println("4. Volver.");
        System.out.print("Selecciona una opción: ");
    }

    private static void agregarArticulo() {
        System.out.print("Introduce el nombre del nuevo artículo: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el precio de venta: ");
        double precioVenta = scanner.nextDouble();
        System.out.print("Introduce el precio de compra: ");
        double precioCompra = scanner.nextDouble();
        System.out.print("Introduce el stock inicial: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Articulo nuevoArticulo = new Articulo(nombre, precioVenta, precioCompra, stock);
        inventario.add(nuevoArticulo); // Creamos un articulo nuevo y le introducimos los datos

        System.out.println("Artículo agregado correctamente.");
    }

    private static void editarArticulo() {
        mostrarArticulos(); // Nos salen los productos que tenemos para ver el ID y modificarlo
        System.out.print("Introduce el ID del artículo a editar: ");
        int idArticulo = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorId(idArticulo);

        if (articulo != null) {
            System.out.print("Introduce el nuevo precio de venta: ");
            double nuevoPrecioVenta = scanner.nextDouble();
            System.out.print("Introduce el nuevo precio de compra: ");
            double nuevoPrecioCompra = scanner.nextDouble();
            System.out.print("Introduce el nuevo stock: ");
            int nuevoStock = scanner.nextInt();
            scanner.nextLine();

            articulo.setPrecioVenta(nuevoPrecioVenta);
            articulo.setPrecioCompra(nuevoPrecioCompra);
            articulo.setStock(nuevoStock);

            System.out.println("Artículo editado correctamente.");
        } else {
            System.err.println("Error: Artículo no encontrado.");
        }
    }

    private static void eliminarArticulo() {
        mostrarArticulos();
        System.out.print("Introduce el ID del artículo a eliminar: ");
        int idArticulo = scanner.nextInt();
        scanner.nextLine();

        Articulo articulo = buscarArticuloPorId(idArticulo);

        if (articulo != null) {
            inventario.remove(articulo); // Eliminamos del array el producto
            System.out.println("Artículo eliminado correctamente.");
        } else {
            System.err.println("Error: Artículo no encontrado.");
        }
    }

    private static Articulo buscarArticuloPorId(int id) {// Esta funcion lo que hace es recorrer todo el ArrayList para
                                                         // mostrar el producto y el ID que tiene
        for (Articulo articulo : inventario) {
            if (articulo.getId() == id) {
                return articulo;
            }
        }
        return null;
    }
}