package ejercicio5.criterio;

import ejercicio5.ElementoFS;

public class CriterioNombre implements Criterio{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return elemento.getNombre().contains(nombre);
    }
}
