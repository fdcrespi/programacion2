package ejercicio10;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {
    private String nombre;
    //Se supuso que todas las tareas sean del tipo que sean
    //tienen un estado
    private String estado;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFin();
    public abstract LocalDate getFechaInicioEstimada();
    public abstract LocalDate getFechaFinEstimada();
    public abstract ArrayList<Recurso> getRecursos();

    public boolean utilizaRecurso(Recurso r){
        return getRecursos().contains(r);
    }
}
