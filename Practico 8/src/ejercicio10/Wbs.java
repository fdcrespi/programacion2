package ejercicio10;

import ejercicio10.criterio.CriterioAnd;
import ejercicio10.criterio.CriterioEstadoTarea;
import ejercicio10.criterio.CriterioTareaAtrasada;

import java.time.Period;
import java.util.ArrayList;

public class Wbs {
    ArrayList<Tarea> tareas;

    public Wbs() {
        tareas = new ArrayList<>();
    }

    public ArrayList<Tarea> tareasAtrasadas() {
        CriterioAnd criterio = new CriterioAnd(new CriterioTareaAtrasada(), new CriterioEstadoTarea("en espera"));
        ArrayList<Tarea> tareasAtrasadas = new ArrayList<>();
        for (Tarea t : tareas) {
            if (criterio.cumple(t)) {
                tareasAtrasadas.add(t);
            }
        }
        return tareasAtrasadas;
    }

    public ArrayList<Tarea> tareasConRecurso(Recurso r) {
        ArrayList<Tarea> tareasTienen = new ArrayList<>();
        for (Tarea t : tareas) {
            if (t.utilizaRecurso(r)) {
                tareasTienen.add(t);
            }
        }
        return tareasTienen;
    }

    public ArrayList<Recurso> recursosEnTarea(Tarea t) {
        return t.getRecursos();
    }

    /**
     * @param t Recibe una tarea
     * @return el periodo estimado de una tarea en cantidad de días
     */
    public int duracionTarea(Tarea t) {
        Period periodo = Period.between(t.getFechaFinEstimada(), t.getFechaInicioEstimada());
        return periodo.getDays();
    }

    public boolean esAsignableRecurso(Recurso r, Tarea t) {
       return r.isAsignableATarea(t);
    }

    public void asignarRecursoATarea(Recurso r, TareaTerminal t){
        if (esAsignableRecurso(r,t)){
            t.addRecurso(r);
            r.addTarea(t);
        }
    }

    public static void main(String[] args) {
        //TODO falta implementar
        Wbs wbs = new Wbs();
        TareaTerminal tarea1 = new TareaTerminal("primer tarea");
        RecursoExclusivo recurso1 = new RecursoExclusivo("lapiz");
        System.out.println(wbs.esAsignableRecurso(recurso1,tarea1));
        wbs.asignarRecursoATarea(recurso1, tarea1);
        System.out.println(wbs.recursosEnTarea(tarea1));
        System.out.println(wbs.esAsignableRecurso(recurso1,tarea1));

    }

}
