public class Ej6Main {
    public static void main(String[] args) {
        try {
            Gato gato1 = new Gato("Tom", 3);
            Gato gato2 = new Gato("Whiskers", -2);
            gato1.imprimir();
            gato2.imprimir();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
