package Ej5;

import java.util.ArrayList;

public abstract class Vehiculos {
    final String matricula;
    final String modelo;

    // Constructor
    public Vehiculos(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Vehiculos [matricula=" + matricula + ", modelo=" + modelo + "]";
    }

    public boolean matriculaValidaTerrestre(String matricula) {
        return matricula.matches("[0-9]{4}[A-Z]{3}");
    }

    public boolean matriculaValidaAcuatico(String matricula) {
        return matricula.matches("[A-Z]{3,10}");
    }

    public boolean matriculaValidaAereo(String matricula) {
        return matricula.matches("[A-Z]{4}[0-9]{6}");
    }

    public static void imprimir(ArrayList<Vehiculos> listaVehiculos) {
        for (Vehiculos vehiculo : listaVehiculos) {
            System.out.println("**Matrícula " + vehiculo.matricula);
            System.out.println("**Modelo " + vehiculo.modelo);
            if (vehiculo instanceof Terrestres) {
                System.out.println("**Numero de ruedas " + ((Terrestres) vehiculo).getNumRuedas());
                if (vehiculo instanceof Coches) {
                    Coches coche = (Coches) vehiculo;
                    System.out.println("**Aire Acondicionado " + coche.aireAcondicionado);
                }
                if (vehiculo instanceof Motos) {
                    Motos moto = (Motos) vehiculo;
                    System.out.println("**Es de color " + moto.color);
                }
            }
            if (vehiculo instanceof Acuaticos) {
                System.out.println("**Y la eslora es de " + ((Acuaticos) vehiculo).getEslora() + " metros");
                if (vehiculo instanceof Barco) {
                    Barco barco = (Barco) vehiculo;
                    System.out.println("**Motor " + barco.motor);
                }
                if (vehiculo instanceof Submarino) {
                    Submarino submarino = (Submarino) vehiculo;
                    System.out.println("**Profundidad " + submarino.profundidad);
                }
            }
            if (vehiculo instanceof Aereos) {
                System.out.println("**Numero de asientos " + ((Aereos) vehiculo).getNumAsientos());
                if (vehiculo instanceof Avion) {
                    Avion avion = (Avion) vehiculo;
                    System.out.println("**Tiempo vuelo " + avion.tiempoVuelo);
                }
                if (vehiculo instanceof Helicoptero) {
                    Helicoptero helicoptero = (Helicoptero) vehiculo;
                    System.out.println("**Numero de elices " + helicoptero.numElices);
                }
            }
        }
    }
}
