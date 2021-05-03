package ejercicio1;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Blockbuster negocio = new Blockbuster();
        Cliente cliente1 = new Cliente("Fede", 35334185);
        Cliente cliente2 = new Cliente("Bauti", 57166950);
        Item auto1 = new Vehiculo("Fiat", 150000, "ABC123", "diesel");
        Item auto2 = new Vehiculo("Ford", 210000, "XYZ789", "naftero");
        Item peli1 = new Pelicula("Volver al futuro", "lorem", 5);
        Item peli2 = new Pelicula("Matrix", "lorem2", 10);
        LocalDate fechahasta = LocalDate.of(2020, 06, 25);
        negocio.alquilar(cliente1, auto1, fechahasta);
        negocio.alquilar(cliente2, auto2, fechahasta);
        negocio.alquilar(cliente1, peli1, fechahasta);
        negocio.imprimirAlquileres();
        System.out.println(negocio.alquileresVencidos());
    }
}
