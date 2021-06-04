package ejercicio10;

import java.util.ArrayList;

public abstract class Recurso {
    private String nombre;
    protected ArrayList<Tarea> tareasAsignado;

    public Recurso(String nombre) {
        this.nombre = nombre;
        tareasAsignado = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract boolean isAsignableATarea(Tarea tarea);

    public void addTarea(Tarea tarea){
        if (isAsignableATarea(tarea)){
            tareasAsignado.add(tarea);
        }
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre ;
    }
}
