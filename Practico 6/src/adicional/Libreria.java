package adicional;

import adicional.condiciones.Condicion;

import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public Libreria(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList<Cliente>();
        productos = new ArrayList<Producto>();
    }

    public void agregarCliente(Cliente cliente){
        if (!clientes.contains(cliente))
            clientes.add(cliente);
    }

    public void agregarProducto(Producto producto){
        if(!productos.contains(producto))
            productos.add(producto);
    }

    public ArrayList<Cliente> buscarClientes (Condicion condicion){
        ArrayList<Cliente> clientesOk = new ArrayList<Cliente>();
        for (Cliente c: clientes
             ) {
            if(condicion.cumple(c)) {
                clientesOk.add(c);
            }
        }
        return clientesOk;
    }

}
