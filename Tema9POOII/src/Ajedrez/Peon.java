package Ajedrez;

import java.awt.Point;

public class Peon extends Pieza {

    public Peon(Point posicion, ColorPieza color) {
        super(posicion, color);
    }

    void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) {
            if (getColor() == ColorPieza.BLANCO) {
                if (getPosicion().y == 1 && y >= 2 && y <= 3) {
                    posicion.setLocation(x, y);
                } else if (y - 1 == getPosicion().y)
                    posicion.setLocation(x, y-1);
            }
            else if (getPosicion().y == 6 && y >= 5 && y <= 4) {
                posicion.setLocation(x, y);
            } else if (y - 1 == getPosicion().y)
                posicion.setLocation(x, y+1);
        }
    }

    @Override
    public char indiceAPosicion(int indice) { // pasará un índice numérico a su letra correspondiente del tablero indice
                                              // = 0-7
        String lista = "ABCDEFGH";
        if (comprobarPosicion(indice))
            return lista.charAt(indice);
        return 'z';
    }

    @Override
    public int indiceAPosicionN(int indice) { // pasará un índice numérico a su posición numérica del tablero
        if (comprobarPosicion(indice))
            return indice + 1;
        return -1;
    }

    @Override
    public int posicionAIndice(char posicion) { // pasará una letra que indica una posición en el tablero a su
                                                // correspondiente índice
        switch (posicion) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            default:
                return -1;
        }
    }

    @Override
    public int posicionAIndice(int posicion) { // pasará una posición númerica en el tablero a su correspondiente índice
        if (comprobarPosicion(posicion))
            return posicion - 1;
        return -1;
    }

}
