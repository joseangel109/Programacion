public class Ej6 {
   String nombre;
   int edad;


   
public Ej6(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
    void imprimir(){
        System.out.println(nombre);
    }
}
