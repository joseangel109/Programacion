package Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class Biblioteca {
    private ArrayList<Publicacion> listadinamia = new ArrayList<>();

    public Biblioteca(ArrayList<Publicacion> listadinamia) {
        this.listadinamia = listadinamia;
    }

    public void anyadir(Publicacion p) throws Exception {
        try {
            listadinamia.add(p);

        } catch (InputMismatchException ex) {
            System.out.println("mal");
        }
    }

    public void anyadirlibro(String isbn, String titulo, Autor a, int ejemplares) throws Exception {
        try {
            listadinamia.add(new Libro(isbn, titulo, a, ejemplares));
        } catch (InputMismatchException ex) {
            System.out.println("Valores incorrectos");
        }
    }

    public Publicacion buscar(int posicion) {
        try {
            return listadinamia.get(posicion);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Fuera de rango");
            return null;
        }
    }

    public boolean buscarLibro(Libro l1) {
        try {
            return listadinamia.contains(l1);
        } catch (InputMismatchException ex) {
            System.out.println("no es un libro pichon");
            return false;
        }
    }

    public ArrayList <Revista> revistasOrdenadas(){
        try{
            ArrayList <Revista> listaRevistas= new ArrayList<>();
            for (Publicacion publicacion : listadinamia) {
                if (publicacion.getClass()==Revista.class){
                    Revista r1= (Revista) publicacion;
                    listaRevistas.add(r1);

                }
                     
            }
            listaRevistas.sort(listaRevistas.get(0).getNombre());
        }
    }
}