package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class CentroComputos {
    public ArrayList<Computadora> computadoras;
    public ArrayList<Proceso> procesos;

    public CentroComputos() {
        this.computadoras = new ArrayList<Computadora>();
        this.procesos = new ArrayList<Proceso>();
    }

    public void addComputadora(Computadora computadora) {
        if (!(computadoras.contains(computadora))) {
            computadoras.add(computadora);
            Collections.sort(computadoras);
        }
    }

    private void addProceso(Proceso proceso) {
        if (!(procesos.contains(proceso))) {
            procesos.add(proceso);
            Collections.sort(procesos);
        }
    }

    public void imprimirComputadoras() {
        for (Computadora c : computadoras
        ) {
            System.out.println(c);
        }
    }

    public void imprimirProcesos() {
        for (Proceso p : procesos
        ) {
            System.out.println(p);
        }
    }

    public void asignarProceso(Proceso proceso) {
        boolean asignado = false;
        int i = 0;
        while (!asignado && i < computadoras.size()) {
            if (computadoras.get(i).realizarProceso(proceso)) {
                asignado = true;
            }
            i++;
        }
        if (!asignado) {
            addProceso(proceso);
        }
    }
}
