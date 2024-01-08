import java.util.Scanner;
public class ProgramaAdrian {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una cadena introducida entre llaves{} y antes de la llave pones un numero");
        String cadena = teclado.nextLine();
        System.out.println(repeticiones(cadena));
        teclado.close();
    }
    public static String repeticiones(String cadena){
        //Tenemos que localizar el { para ver la longitud y hacer una cadena con las primeras posiciones para ver cuantos numeros son
            String cadenaCA= cadena.substring(0,cadena.indexOf("{"));
            int numeroInicio = Integer.parseInt(cadenaCA);
            String cadenaCC= cadena.substring(0,cadena.lastIndexOf("}"));
            int numeroFin = Integer.parseInt(cadenaCC);
            String veces= cadena.substring(0, numeroInicio);
            int numVeces= Integer.parseInt(veces);
            StringBuilder textoFin=new StringBuilder(" ");
            String parteTexto= cadena.substring(numeroInicio, numeroFin);
            for (int i = 0; i < numVeces; i++) {
                textoFin = textoFin.append(parteTexto);
            }
            String textoEnd= textoFin.toString();
            return textoEnd;
    }
}    