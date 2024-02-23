package Ej5;

import java.util.ArrayList;

public class Programa {
    private static ArrayList<Vehiculos> listaVehiculos = new ArrayList<>();

    public static void main(String[] args) {
        // **Coches**
        listaVehiculos.add(new Coches("1234ASD", "Prius", 4, true));
        listaVehiculos.add(new Coches("7645GTF", "Mustang", 4, false));
        listaVehiculos.add(new Coches("3456VFR", "488 GTB", 4, true));

        // **Motos**
        listaVehiculos.add(new Motos("7654TGH", "CBR650R", 2, "Azul"));
        listaVehiculos.add(new Motos("4567KJH", "Softail Slim", 2, "Rojo"));
        listaVehiculos.add(new Motos("2345DFG", "Monster 821", 2, "Negro"));

        // **Aviones**
        listaVehiculos.add(new Avion("789213SDFF", "747", 98, 4));
        listaVehiculos.add(new Avion("56217SDRTF", "A380", 123, 10));
        listaVehiculos.add(new Avion("123456TYUI", "172", 76, 9));

        // **Helicópteros**
        listaVehiculos.add(new Helicoptero("123456QWER", "H135", 2, 6));
        listaVehiculos.add(new Helicoptero("098765TGBH", "UH-1 Iroquois", 3, 4));
        listaVehiculos.add(new Helicoptero("789456HGJT", "R44", 6, 4));

        // **Barcos**
        listaVehiculos.add(new Barco("QWERRT", "Azimut 66", 4, true));
        listaVehiculos.add(new Barco("GTRD", "Swan 65", 12, false));
        listaVehiculos.add(new Barco("GHJYS", "Atlantic 47", 25, false));

        // **Submarinos**
        listaVehiculos.add(new Submarino("POÑLK", "Akula", 35, 600));
        listaVehiculos.add(new Submarino("GHJUF", "Nautilus", 15, 400));
        listaVehiculos.add(new Submarino("RTFGVB", "Triton 36000/3", 2, 360));

        // **Terrestres**
        listaVehiculos.add(new Terrestres("1234ASD", "Volvo FH16", 12));
        listaVehiculos.add(new Terrestres("6789FGH", "Mercedes-Benz Travego", 10));
        listaVehiculos.add(new Terrestres("4343HHH", "Trek Madone", 2));

        // **Aéreos**
        listaVehiculos.add(new Aereos("123456HYUJ", "DJI Phantom 4 Pro", 0));
        listaVehiculos.add(new Aereos("123456HGYT", "Grob G 103 Twin II", 2));
        listaVehiculos.add(new Aereos("456123GHTY", "Parachute Systems Sabre2", 1));

        // **Acuáticos**
        listaVehiculos.add(new Acuaticos("JHGFF", "Perception Pescador", 10));
        listaVehiculos.add(new Acuaticos("CVFD", "Intex Explorer K2", 5));
        listaVehiculos.add(new Acuaticos("asa", "O'Neill Psycho Freak", 2));

        Vehiculos.imprimir(listaVehiculos);
    }
}
