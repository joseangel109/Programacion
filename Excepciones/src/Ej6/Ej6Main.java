package Ej6;

public class Ej6Main {
    // Implementa una clase Gato con los atributos nombre y edad, un constructor con
    // parámetros, los getters y setters, además de un método imprimir() para
    // mostrar
    // los datos de un gato. El nombre de un gato debe tener al menos 3 caracteres y
    // la
    // edad no puede ser negativa. Por ello, tanto en el constructor como en los
    // setters,
    // deberás comprobar que los valores sean válidos y lanzar una ‘Exception’ si no
    // lo
    // son. Luego, haz una clase principal con main para hacer pruebas: instancia
    // varios
    // objetos Gato y utiliza sus setters, probando distintos valores (algunos
    // válidos y
    // otros incorrectos). Maneja las excepciones.

    public static void main(String[] args) {
        try {
            Ej6_1 gato1 = new Ej6_1("Tom", 3);
            Ej6_1 gato2 = new Ej6_1("Whiskers", -2);
            gato1.imprimir();
            gato2.imprimir();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
