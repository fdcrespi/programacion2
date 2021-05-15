package adicional;

import java.util.ArrayList;
import java.util.Collections;

public class Grupo extends ElementoEmpresa{
    ArrayList<Empleado> empleados;

    public Grupo(String nombre) {
        super(nombre);
        this.empleados = new ArrayList<Empleado>();
    }

    @Override
    public ArrayList<Empleado> getEmpleados(String especialidad) {
        ArrayList<Empleado> empleadosCumplen = new ArrayList<Empleado>();
        for (Empleado e: empleados) {
            if (e.getEspecialidad().equals(especialidad)) empleadosCumplen.add(e);
        }
        return empleadosCumplen;
    }

    @Override
    public String getEspecialidad() {
        if(!empleados.isEmpty()) {
            int i = 0;
            int contador = 0;
            int cantMayor = 0;
            String especilidadMayoria = empleados.get(i).getEspecialidad();
            Collections.sort(empleados); //Se implemento Comparable en Empleado
            while(i < empleados.size()){
                contador = contarEmpleados(empleados.get(i).getEspecialidad());
                if (contador > cantMayor){
                    cantMayor = contador;
                    especilidadMayoria = empleados.get(i).getEspecialidad();
                }
                i = empleados.lastIndexOf(empleados.lastIndexOf(empleados.get(i).getEspecialidad())) + 1;
            }
            return especilidadMayoria;
        } return "";
    }

    @Override
    public int contarEmpleados(String especialidad) {
        return getEmpleados(especialidad).size();
    }
}
