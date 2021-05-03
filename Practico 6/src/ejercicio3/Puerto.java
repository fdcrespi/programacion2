package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    ArrayList<Barco> barcos;
    ArrayList<Camion> camiones;

    public Puerto() {
        barcos = new ArrayList<Barco>();
        camiones = new ArrayList<Camion>();
    }

    public void addBarco(Barco barco) {
        if (!barcos.contains(barco)) {
            barcos.add(barco);
            Collections.sort(barcos);
        }
    }

    public void addCamion (Camion camion){
        if(!camiones.contains(camion)){
            camiones.add(camion);
            Collections.sort(camiones);
        }
    }

    public void asignarCamiones(){
    }

}
