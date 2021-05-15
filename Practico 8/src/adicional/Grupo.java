package adicional;

import java.util.ArrayList;

public class Grupo extends ElementoEmpresa{
    private ArrayList<ElementoEmpresa> elementos;

    public Grupo(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<ElementoEmpresa>();
    }

    public void addElemento(ElementoEmpresa e){
        if (!elementos.contains(e)) elementos.add(e);
    }

    @Override
    public ArrayList<Empleado> getEmpleados(String especialidad) {
        ArrayList<Empleado> empleadosCumplen = new ArrayList<Empleado>();
        for (ElementoEmpresa e: elementos) {
            empleadosCumplen.addAll(e.getEmpleados(especialidad));
        }
        return empleadosCumplen;

        /*
        * En la linea 21 puede ir esto
        *for(ElementoEmpresa emp1: e.getEmpleados(especialidad)){
        *       empleadosCumplen.add(emp1);
        *}
        */
    }

    @Override
    public String getEspecialidad() {
        int cantidadMayor = 0;
        String especialidad = null;
        if(!elementos.isEmpty()) {
            for (ElementoEmpresa e: elementos) {
                String especialidadActual = e.getEspecialidad();
                int cantidadActual = contarEmpleados(especialidadActual);
                if (cantidadMayor < cantidadActual){
                    especialidad = especialidadActual;
                    cantidadMayor = cantidadActual;
                }
            }
        } return especialidad;
    }

    @Override
    public int contarEmpleados(String especialidad) {
        //return getEmpleados(especialidad).size();
        int contador = 0;
        for (ElementoEmpresa e: elementos) {
            contador += e.contarEmpleados(especialidad);
        }
        return contador;
    }
}
