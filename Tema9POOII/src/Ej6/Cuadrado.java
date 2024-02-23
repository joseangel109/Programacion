package Ej6;

public class Cuadrado implements Figura2D {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        double area = lado * lado;
        return area;
    }

    @Override
    public void escalar(double escala) {
        if (escala > 0)
            this.lado = lado * 2;

    }

    @Override
    public void imprimir() {
        System.out.println("El perimetro del cuadrado es: " + perimetro() + " y el area es: " + area());

    }

    @Override
    public double perimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }

}
