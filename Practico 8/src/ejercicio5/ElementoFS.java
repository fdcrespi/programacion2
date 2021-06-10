package ejercicio5;

import ejercicio5.criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoFS {
    private String nombre;
    private LocalDate creacion;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.creacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public abstract double getTamanio();
    public abstract ArrayList<ElementoFS> buscar(Criterio criterio);

    @Override
    public boolean equals(Object o) {
        ElementoFS that = (ElementoFS) o;
        return getNombre().equals(that.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Creacion:" + creacion +'\n';
    }
}
