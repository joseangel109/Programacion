package Ej7;

import java.util.ArrayList;

public class Tablero {
   private ArrayList<Casilla> casillas;

   public Tablero() {
      casillas = new ArrayList<>();

      casillas.add(new Terreno("ter1", 123, 12, 45, Terreno.Color.VERDE));
      casillas.add(new Terreno("ter2", 1230, 120, 450, Terreno.Color.VERDE));
      casillas.add(new Estaciones("Norte"));
      casillas.add(new Terreno("terROJ1", 123, 12, 45, Terreno.Color.ROJO));
      casillas.add(new Estaciones("Sur"));
   }

   public void mostrarTablero() {
      for (Casilla laCasilla : this.casillas) {
         System.out.println(laCasilla);
      }
   }

   public ArrayList<Terreno> listaTerrenos(int jugador) {
      ArrayList<Terreno> lista = new ArrayList<>();
      for (Casilla terreno : casillas) {
         if (terreno instanceof Terreno) {
            Terreno t = (Terreno) terreno;
            if (t.getPropietario() == jugador)
               lista.add(t);
         }
      }
      return lista;
   }

   public static void main(String[] args) {
      Tablero t = new Tablero();
      t.mostrarTablero();
   }
}
