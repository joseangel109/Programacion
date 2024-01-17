package tema8.joseangel;

import java.util.Scanner;

public class Ej4Programa {
    static Scanner entrada = new Scanner(System.in);
    Ej4Factura factura = null;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ej4Programa programa = new Ej4Programa();
        while (true) {
            switch (programa.menu()) {
                case 0: {
                    System.exit(0);
                }
                case 1: {
                    programa.altaFactura();
                    break;
                }
                case 2: {
                    if (programa.factura != null)
                        programa.altaLinea();
                    else
                        System.out.println("La factura no se ha dado de alta");
                    break;
                }
                case 3: {
                    if (programa.factura != null)
                        programa.bajaLinea();
                    else
                        System.out.println("La factura no se ha dado de alta");
                    break;
                }
                case 4: {
                    if (programa.factura != null)
                        programa.factura.mostrarFactura();
                    else
                        System.out.println("La factura no se ha dado de alta");
                    break;
                }
                default:
                    System.err.println("Opcioń incorrecta.");
            }
        }
    }

    int menu() {
        System.out.println("Facturas");
        System.out.println("1 - Alta Factura");
        System.out.println("2 - Añadir línea");
        System.out.println("3 - Eliminar línea");
        System.out.println("4 - Mostrar Factura");
        System.out.println("0 - Salir");
        System.out.print("Introduce la opción deseada:");
        return Integer.parseInt(entrada.nextLine());
    }

    void altaFactura() {
        System.out.print("Introduce el número de la factura:");
        String id = entrada.nextLine();
        System.out.print("Introduce el número de cliente:");
        String cliente = entrada.nextLine();
        factura = new Ej4Factura(id, cliente);
    }

    void altaLinea() {
        System.out.print("Introduce la descripción del producto: ");
        String descripcion = entrada.nextLine();
        System.out.print("Introduce el precio unitario del producto: ");
        double precioU = Double.parseDouble(entrada.nextLine());
        System.out.print("Introduce la cantidad de unidades: ");
        int cantidad = Integer.parseInt(entrada.nextLine());
        this.factura.anyadirLinea(descripcion, precioU, cantidad);
        System.out.println("Linea añadida correctamente");
    }

    void bajaLinea() {
        System.out.print("Introduce el número de línea a borrar: ");
        int linea = Integer.parseInt(entrada.nextLine());
        this.factura.quitarLinea(linea);
        System.out.println("Línea eliminada correctamente");
    }
}