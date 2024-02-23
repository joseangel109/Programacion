package Ajedrez;
import java.awt.Point;

public abstract class Pieza implements JuegoTablero {
//     Ccolor, indica el color de la pieza, y podrá tener los valores BLANCO o NEGRO, definidos en una enumeración  de nombre ColorPieza
// posicion, que indicará la posición de la pieza en el tablero. De tipo Point (importa java.awt.Point)
// comida, que indicará si la ficha ha sido comida o no, de tipo boolean
    protected enum ColorPieza{BLANCO, NEGRO};
    protected Point posicion;
    protected boolean comida;
    private ColorPieza color;

    //Crea tres constructores para la clase Pieza

    //El primero recibirá los valores del color, de la posición X y de la Y. Asignará los valores a los atributos correspondientes y comprobará que los valores de las posiciones son correctos. Si lo son pondrá comida a falso, si no son correctos pondrá comida a verdadero.
    public Pieza(Point posicion, ColorPieza color) {
        this.posicion = posicion;
        this.color = color;
    if (comprobarPosicion((int)posicion.getX()) && comprobarPosicion((int)posicion.getY())){
        comida = false;
    } else comida = true;
        comida=false;
    }

    //El segundo, que deberá usar el primero, no recibirá ningún parámetro y creará una nueva Pieza en la posición 10, 10 y de color BLANCO.
    public Pieza(){
        this(new Point(10, 10), ColorPieza.BLANCO);
    }
    
    //El tercero, que usará el primero, recibe como parámetro una Pieza, y copiará sus atributos a la nueva Pieza,
    public Pieza(Pieza pieza){
        this(pieza.getPosicion(), pieza.getColor());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    // Sobreescribe el método equals. Se considerará que una pieza es igual a la otra si es el mismo tipo de pieza, del mismo color y se encuentra en la misma posición.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pieza other = (Pieza) obj;
        if (posicion == null) {
            if (other.posicion != null)
                return false;
        } else if (!posicion.equals(other.posicion))
            return false;
        if (color != other.color)
            return false;
        return true;
    }

//Crea métodos públicos para acceder y poner valor a los atributos.
    public Point getPosicion() {
        return posicion;
    }
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    public boolean isComida() {
        return comida;
    }
    public void setComida(boolean comida) {
        this.comida = comida;
    }
    public ColorPieza getColor(){
        return color;
    }
//Crea un método accesible únicamente por sus clases derivadas 
    protected static boolean comprobarPosicion(int p){
        if(p>=0 && p<=7) return true;
        else return false;
    }

//Crear el métodos públicos y abstracto:
    abstract void mover(int x, int y);


}