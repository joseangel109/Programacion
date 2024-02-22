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
}
