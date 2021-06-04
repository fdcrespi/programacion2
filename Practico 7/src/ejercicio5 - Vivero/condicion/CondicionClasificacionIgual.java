package ejercicio5.condicion;

import ejercicio5.Planta;

import java.util.Locale;

public class CondicionClasificacionIgual implements Condicion{
    private String clasificacion;

    public CondicionClasificacionIgual(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion.toLowerCase();
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacionSuperior().equals(getClasificacion());
    }
}
