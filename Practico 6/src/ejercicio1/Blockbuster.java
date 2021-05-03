package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Blockbuster {
    public ArrayList<Cliente> clientes;
    public ArrayList<Item> items;
    public ArrayList<Alquiler> alquileres;

    public Blockbuster() {
        this.items = new ArrayList<Item>();
        this.alquileres = new ArrayList<Alquiler>();
    }

    public void addItem(Item item) {
        if (!(items.contains(item))) items.add(item);
    }

    public void addCliente(Cliente cliente) {
        if (!(clientes.contains(cliente))) clientes.add(cliente);
    }

    public void addAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public ArrayList<Cliente> alquileresVencidos() {
        ArrayList<Cliente> deudores = new ArrayList<Cliente>();
        for (Alquiler a : alquileres) {
            if (LocalDate.now().isAfter(a.fechaHasta)) {
                deudores.add(a.getCliente());
            }
        }
        return deudores;
    }

    public void alquilar(Cliente cliente, Item item, LocalDate hasta) {
        if (item.alquilar()) {
            Alquiler newAlquiler = new Alquiler(cliente, item, LocalDate.now(), hasta);
            addAlquiler(newAlquiler);
            cliente.addItem(item);
        }
    }

    public void imprimirAlquileres() {
        System.out.println(alquileres);
    }
}
