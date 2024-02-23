package Ajedrez;

import java.awt.Point;

import javax.swing.text.Position;

public class Peon extends Pieza {

    public Peon(Point posicion, ColorPieza color) {
        super(posicion, color);
    }

    void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) {
            if (getPosicion().y == 1 && y >= 2 && y <= 3) {
                posicion.setLocation(x, y);
            } else if (y - 1 == getPosicion().y)
                posicion.setLocation(x, getPosicion().y + 1);
        }
    }
}
