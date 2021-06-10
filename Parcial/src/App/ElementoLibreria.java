package App;

import App.criterio.CriterioElemento;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ElementoLibreria {
    private String nombre;

    public ElementoLibreria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getMarca();
    public abstract double getVolumen();
    public abstract double getPrecio();
    public abstract int getCantidadProductos();
    public abstract ArrayList<ElementoLibreria> buscar(CriterioElemento criterio);

    @Override
    public String toString() {
        return "ElementoLibreria{" +
                "nombre='" + nombre + '\'' +
                "marca='" + getMarca() + '\'' +
                "precio='" + getPrecio() + '\'' +
                "volumen='" + getVolumen() + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        try {
            ElementoLibreria elemento = (ElementoLibreria) o;
            return getNombre().equals(elemento.getNombre().toLowerCase()) && getMarca().equals(elemento.getMarca().toLowerCase());
        }catch (Exception e){
            return false;
        }
    }
}
