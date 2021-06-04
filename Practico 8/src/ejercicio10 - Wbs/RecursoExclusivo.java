package ejercicio10;

public class RecursoExclusivo extends Recurso {

    public RecursoExclusivo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean isAsignableATarea(Tarea tarea) {
        if(!tareasAsignado.contains(tarea)){
            for (Tarea t: tareasAsignado) {
                if(tarea.getFechaInicio().isAfter(t.getFechaInicio()) && tarea.getFechaInicio().isBefore(t.getFechaFin())){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
