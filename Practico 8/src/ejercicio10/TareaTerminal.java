package ejercicio10;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends Tarea{
    private LocalDate fechaInicioReal;
    private LocalDate fechaFinReal;
    private LocalDate fechaInicioEstimada;
    private LocalDate fechaFinEstimada;
    private ArrayList<Recurso> recursos;

    public TareaTerminal(String nombre) {
        super(nombre);
        recursos = new ArrayList<>();
    }

    public LocalDate getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(LocalDate fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public LocalDate getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(LocalDate fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

    public void setFechaInicioEstimada(LocalDate fechaInicioEstimada) {
        this.fechaInicioEstimada = fechaInicioEstimada;
    }

    public void setFechaFinEstimada(LocalDate fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    @Override
    public LocalDate getFechaInicio() {
        return getFechaInicioReal();
    }

    @Override
    public LocalDate getFechaFin() {
        return getFechaFinReal();
    }

    @Override
    public LocalDate getFechaInicioEstimada() {
        return fechaInicioEstimada;
    }

    @Override
    public LocalDate getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> copia = new ArrayList<>(recursos);
        return copia;
    }

    public void addRecurso(Recurso r){
        if (r.isAsignableATarea(this)){
            recursos.add(r);
        }
    }

}
