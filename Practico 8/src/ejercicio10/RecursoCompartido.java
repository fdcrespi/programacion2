package ejercicio10;

public class RecursoCompartido extends Recurso {

    public RecursoCompartido(String nombre) {
        super(nombre);
    }

    @Override
    public boolean isAsignableATarea(Tarea tarea) {
        return true;
    }
}
