package Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class Biblioteca {
    ArrayList<Publicacion> lista = new ArrayList<>();

    public void anyadir(Publicacion p) {
        lista.add(p);
    }

    public boolean anyadirlibro(String isbn, String titulo, int ejemplares) {
        try {
            lista.add(new Libro(isbn, titulo, ejemplares));
            return true;
        } catch (ValorIncorrecto | PublicacionException e) {
            System.out.println("Se ha producido un error en la creacion del libro: " + e.getMessage());
        }
        return false;
    }

    public Publicacion buscar(String titulo) throws PublicacionException{
        for (Publicacion publicacion : lista) {
            if (publicacion instanceof Libro) {
                Libro esunLibro = (Libro) publicacion;
                if (esunLibro.getTitulo())
                    return esunLibro;
            } else {
                Revista esunaRevista = (Revista) publicacion;
                if (esunaRevista.getNombre())
                    return esunaRevista;
            }
        }
        throw new PublicacionException("El libro no se ha encontrado. Titulo: "+titulo);
    }

    public boolean buscarLibro(Libro libro) {
        for (Publicacion publicacion : lista) {
            if (publicacion.equals(libro))
                return true;
        }
        return false;
    }

    public ArrayList<Revista> revistasOrdenadas(){
        ArrayList<Revista> revistas=new ArrayList<>();
        for (Publicacion publicacion : lista) {
            if(publicacion instanceof Revista)
                revistas.add((Revista)publicacion);
        }
        Collections.sort(revistas);
        return revistas;
    }

    public void ordenar(){
        Collections.sort(lista);
    }
    
    public void mostrarLineas(){
        ordenar();
        for (Publicacion publicacion : lista) {
            publicacion.mostrarEnLinea();
        }
    }
}
