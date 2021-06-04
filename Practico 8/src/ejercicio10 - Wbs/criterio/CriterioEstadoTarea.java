package ejercicio10.criterio;

import ejercicio10.Tarea;

public class CriterioEstadoTarea implements Criterio{
    private String estado;

    public CriterioEstadoTarea(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean cumple(Tarea t) {
        return t.getEstado().equals(estado);
    }
}
