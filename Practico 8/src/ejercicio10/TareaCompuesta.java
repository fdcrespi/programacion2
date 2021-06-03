package ejercicio10;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea{
    private ArrayList<Tarea> tareas;

    public TareaCompuesta(String nombre) {
        super(nombre);
        tareas = new ArrayList<>();
    }

    @Override
    public LocalDate getFechaInicio() {
        if(!tareas.isEmpty()){
            LocalDate fechaMenor = tareas.get(0).getFechaInicio();
            for (int i = 1; i < tareas.size(); i++) {
                LocalDate fechaActual = tareas.get(i).getFechaInicio();
                if (fechaActual.isBefore(fechaMenor)){
                    fechaMenor = fechaActual;
                }
            }
            return fechaMenor;
        }
        return null;
    }

    @Override
    public LocalDate getFechaFin() {
        if(!tareas.isEmpty()){
            LocalDate fechaMayor = tareas.get(0).getFechaFin();
            for (int i = 1; i < tareas.size(); i++) {
                LocalDate fechaActual = tareas.get(i).getFechaFin();
                if (fechaActual.isAfter(fechaMayor)){
                    fechaMayor = fechaActual;
                }
            }
            return fechaMayor;
        }
        return null;
    }

    @Override
    public LocalDate getFechaInicioEstimada() {
        if(!tareas.isEmpty()){
            LocalDate fechaMenor = tareas.get(0).getFechaInicioEstimada();
            for (int i = 1; i < tareas.size(); i++) {
                LocalDate fechaActual = tareas.get(i).getFechaInicioEstimada();
                if (fechaActual.isBefore(fechaMenor)){
                    fechaMenor = fechaActual;
                }
            }
            return fechaMenor;
        }
        return null;
    }

    @Override
    public LocalDate getFechaFinEstimada() {
        if(!tareas.isEmpty()){
            LocalDate fechaMayor = tareas.get(0).getFechaFinEstimada();
            for (int i = 1; i < tareas.size(); i++) {
                LocalDate fechaActual = tareas.get(i).getFechaFinEstimada();
                if (fechaActual.isAfter(fechaMayor)){
                    fechaMayor = fechaActual;
                }
            }
            return fechaMayor;
        }
        return null;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        ArrayList<Recurso> recursos = new ArrayList<>();
        for (Tarea t: tareas) {
            for (Recurso r: t.getRecursos()) {
                if (!recursos.contains(r)){
                    recursos.add(r);
                }
            }
        }
        return recursos;
    }

}
