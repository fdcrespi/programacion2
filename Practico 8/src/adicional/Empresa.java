package adicional;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<ElementoEmpresa> elementos;

    public static void main(String[] args) {
        Empresa industrial = new Empresa();
        Grupo sucursal1 = new Grupo("sucursal1");
        Grupo sucursal2 = new Grupo("sucursal2");
        Grupo grupoTrab1 = new Grupo("grupoTrab1");
        Grupo grupoTrab2 = new Grupo("grupoTrab2");
        Empleado empleado1 = new Empleado("Luis", "especialidad1", 10000);
        Empleado empleado2 = new Empleado ("Marcelo", "especialidad1", 10000);
        Empleado empleado3 = new Empleado("Cristian", "especialidad2", 8000);
        Empleado empleado4 = new Empleado("Juan", "especialidad2", 8000);
        Empleado empleado5 = new Empleado("Guido", "especialidad2", 8000);

        grupoTrab1.addElemento(empleado1);
        grupoTrab1.addElemento(empleado2);
        grupoTrab2.addElemento(empleado3);
        grupoTrab2.addElemento(empleado4);
        grupoTrab2.addElemento(empleado5);
        sucursal1.addElemento(grupoTrab1);
        sucursal2.addElemento(grupoTrab2);

        System.out.println(empleado1.getEspecialidad() + " - " + empleado1.contarEmpleados("especialidad1"));
        System.out.println(grupoTrab1.getEspecialidad() + " - " + grupoTrab1.contarEmpleados("especialidad1"));
        System.out.println(sucursal1.getEspecialidad() + " - " + sucursal1.contarEmpleados("especialidad1"));


    }
}
