package ejercicio10.criterio;

import ejercicio10.Tarea;

import java.time.LocalDate;

public class CriterioTareaAtrasada implements Criterio{
    @Override
    public boolean cumple(Tarea t) {
        return t.getFechaFinEstimada().isAfter(LocalDate.now());
    }
}
