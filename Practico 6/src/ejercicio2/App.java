package ejercicio2;

import java.util.Collections;

public class App {

    public static void main(String[] args) {
        CentroComputos centro = new CentroComputos();
        Computadora pc1 = new Computadora(1, 1500);
        Computadora pc2 = new Computadora(2, 2000);
        Computadora pc3 = new Computadora(3, 1750);
        centro.addComputadora(pc1);
        centro.addComputadora(pc2);
        centro.addComputadora(pc3);
        centro.imprimirComputadoras();
        Proceso proc1 = new Proceso(1, 25);
        Proceso proc2 = new Proceso(2, 6);
        Proceso proc3 = new Proceso(3, 10);
        Proceso proc4 = new Proceso(4, 9);
        Proceso proc5 = new Proceso(5, 8);
        centro.imprimirProcesos();
        centro.asignarProceso(proc1);
        centro.asignarProceso(proc2);
        centro.asignarProceso(proc3);
        centro.asignarProceso(proc4);
        centro.asignarProceso(proc5);
        centro.imprimirProcesos();
    }
}
