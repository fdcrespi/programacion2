package ejercicio5.criterio;

import ejercicio5.ElementoFS;

import java.time.LocalDate;

public class CriterioFechaModificacionMayor implements Criterio{
    private LocalDate fecha;

    public CriterioFechaModificacionMayor(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return elemento.getCreacion().compareTo(fecha) > 0;
    }
}
