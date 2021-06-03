package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioTieneNombre implements Criterio{
    private String nombre;

    public CriterioTieneNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.contieneNombre(nombre);
    }
}
