package ejercicio1;

import java.util.ArrayList;

public class Cliente {
    public String nombre;
    public int dni;
    public ArrayList<Item> alquileres;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        alquileres = new ArrayList<Item>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void addItem(Item item){
        alquileres.add(item);
    }

    public boolean equals(Cliente cliente) {
        return this.getDni() == cliente.getDni();
    }

    public String toString(){
        return "Nombre: " + getNombre() + " DNI: " + getDni();
    }

}
