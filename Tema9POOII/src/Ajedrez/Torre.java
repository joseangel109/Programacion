package Ajedrez;

import java.awt.Point;

import javax.swing.text.Position;

public class Torre extends Pieza {

    public Torre(Point posicion, ColorPieza color) {
        super(posicion, color);
    }

    void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) {
            if (getPosicion().x == x || getPosicion().y == y) {
                posicion.setLocation(x, y);
            }
        }
    }

    @Override
    public char indiceAPosicion(int indice) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int indiceAPosicionN(int indice) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int posicionAIndice(char posicion) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int posicionAIndice(int posicion) {
        // TODO Auto-generated method stub
        return 0;
    }
}
