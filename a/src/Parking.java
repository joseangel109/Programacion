public class Parking {
    public static void main(String[] args) {
        Vehiculos coche1 = new General("1234RFD", 19, 20);
        Vehiculos coche2 = new General("7654RFD", 18, 21);
        Vehiculos auto1 = new Autobuses("8654frg", 14, 56, 10);
        Vehiculos furgo1 = new Furgonetas("saa", 10, 10, 10);
        Vehiculos.listaParkin.add(coche2);
        Vehiculos.listaParkin.add(furgo1);
        Vehiculos.listaParkin.add(coche1);
        Vehiculos.listaParkin.add(auto1);

        Vehiculos.salida("1234RFD");
        for (Vehiculos vehiculos : Vehiculos.listaParkin) {
            System.out.println(vehiculos);
        }

    }
}
