package ejercicio13.criterioEstacion;

import ejercicio13.Sensor;

import java.util.Locale;

public class CriterioNombre implements CriterioEstacion{
    private String nombre;

    public CriterioNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Sensor s) {
        return nombre.toLowerCase().equals(s.getNombre().toLowerCase());
    }
}
