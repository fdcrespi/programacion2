package app;

public class Main {
    public static void main(String[] args) {
        Municipio tsas = new Municipio();
        Comercio comercio1 = new Comercio("Comercio1","Kiosko", 20, false);
        Comercio comercio2 = new Comercio("Comercio2", "Libreria", 250, false);
        Comercio comercio3 = new Comercio("Comercio3", "Cerveceria", 500, true);
        Comercio comercio4 = new Comercio("Comercio4", "Cerveceria", 800, true);
        Comercio comercio5 = new Comercio("Comercio5", "Cafeteria", 30, true);
        Cliente cliente1 = new Cliente("Luis", 123456);
        Cliente cliente2 = new Cliente("Marcelo", 123456);
        Cliente cliente3 = new Cliente("Federico", 123456);

        comercio1.addProtocolo("uso de barbijo");
        comercio1.addProtocolo("distancia de 2 metros");
        comercio2.addProtocolo("distancia de 2 metros");
        comercio2.addProtocolo("Alcohol en gel disponible");
        comercio3.addProtocolo("uso de barbijo");
        comercio3.addProtocolo("distancia de 2 metros");
        comercio3.addProtocolo("uso de barbijo");
        comercio4.addProtocolo("uso de barbijo");
        comercio5.addProtocolo("alcohol en gel disponible");

        tsas.addComercio(comercio1);
        tsas.addComercio(comercio2);
        tsas.addComercio(comercio3);
        tsas.addComercio(comercio4);
        tsas.addComercio(comercio5);

        cliente1.setEspacioLibre(true);
        System.out.println(tsas.buscarComercio(cliente1));
        System.out.println(tsas.buscarComercio(cliente1, comercio1));
        System.out.println("----------");
        System.out.println(tsas.comerciosConSuperfieMayor(45));
        System.out.println(tsas.comerciosDeRubro("cerveceria"));
        System.out.println(tsas.comercionConProtocolo("alcohol En GEl disponible"));
        System.out.println(tsas.comercioNombreRubro("comercio1", "kiosko"));
        System.out.println(tsas.comercioNombreDistinto("comercio1"));
        System.out.println(tsas.comerciosRubros("cafeteria", "cerveceria"));
    }
}
