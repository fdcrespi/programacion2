package adicional;

import adicional.condiciones.Condicion;
import adicional.condiciones.CondicionAnd;
import adicional.condiciones.CondicionAutor;
import adicional.condiciones.CondicionNot;

public class app {
    public static void main(String[] args) {
        Libreria libreria = new Libreria("Lumi");
        Cliente cliente1 = new ClienteExigente("Marcelo", "Armentano", 12345, "altura1", 20);
        Cliente cliente2 = new Cliente("Andrea", "Gherbi", 98761, "altura2", 30);
        cliente1.agregarAutor("Luis");
        cliente1.agregarAutor("Noelia");
        cliente2.agregarAutor("Noelia");
        cliente2.agregarAutor("Cristian");
        libreria.agregarCliente(cliente1);
        libreria.agregarCliente(cliente2);
        Condicion busqueda1 = new CondicionAutor("Noelia");
        Condicion busqueda2 = new CondicionNot(new CondicionAutor("Cristian"));
        Condicion busquedaAutor = new CondicionAnd(busqueda1, busqueda2);
        System.out.println(libreria.buscarClientes(busqueda1));
        System.out.println(libreria.buscarClientes(busqueda2));
        System.out.println(libreria.buscarClientes(busquedaAutor));
    }
}
