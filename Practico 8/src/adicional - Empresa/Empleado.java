package adicional;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String especialidad, double sueldo) {
        super(nombre);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    @Override
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public ArrayList<Empleado> getEmpleados(String especialidad) {
        ArrayList<Empleado> empleadoCumple = new ArrayList<Empleado>();
        if(getEspecialidad().equals(especialidad)){
            empleadoCumple.add(this);
        }
        return empleadoCumple;
    }

    @Override
    public int contarEmpleados(String especialidad) {
        if(getEspecialidad().equals(especialidad)){
            return 1;
        }
        return 0;
    }

}
