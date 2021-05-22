package criterio;

import app.Comercio;

import java.util.Locale;

public class CriterioNombre implements Criterio{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Comercio c) {
        return c.getNombre().toLowerCase().equals(nombre.toLowerCase());
    }
}
