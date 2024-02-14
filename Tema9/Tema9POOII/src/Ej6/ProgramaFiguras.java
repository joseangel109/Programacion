package Ej6;

import java.util.ArrayList;

import javax.swing.undo.CannotUndoException;

public class ProgramaFiguras {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras=new ArrayList<>();
        listaFiguras.add(new Cuadrado(5));
        listaFiguras.add(new Rectangulo(5, 10));
        listaFiguras.add(new Triangulo(10, 10));
        listaFiguras.add(new Cuadrado(10));
        for (Figura2D figuras2D : listaFiguras) {
            figuras2D.imprimir();
        }
        System.out.println("Lo escalamos a dos");
        for (Figura2D figuras2D : listaFiguras) {
            figuras2D.escalar(2);
        }
        for (Figura2D figuras2D : listaFiguras) {
            figuras2D.imprimir();
        }
        System.out.println("Lo escalamos a 0.1");
        for (Figura2D figuras2D : listaFiguras) {
            figuras2D.escalar(0.1);
        }
        for (Figura2D figuras2D : listaFiguras) {
            figuras2D.imprimir();
        }
    }
}
