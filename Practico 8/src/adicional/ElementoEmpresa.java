package adicional;

import java.util.ArrayList;

public abstract class ElementoEmpresa {
    private String nombre;

    public ElementoEmpresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //TODO getespecialidad():string
    public abstract String getEspecialidad();
    //todo contarempleados(String e): int}
    public abstract int contarEmpleados(String especialidad);
    //TODO getEmpleados(String e): ArrayList
    public abstract ArrayList<Empleado> getEmpleados(String especialidad);
}
