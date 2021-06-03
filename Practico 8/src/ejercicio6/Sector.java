package ejercicio6;

import java.util.ArrayList;

public class Sector extends Lugar{
    private ArrayList<Lugar> lugares;

    public Sector(String nombre) {
        super(nombre);
        lugares = new ArrayList<>();
    }

    public void addLugar(Lugar lugar){
        if(!lugares.contains(lugar)){
            lugares.add(lugar);
        }
    }

    @Override
    public int cantidadCartasRegalo(String regalo) {
        int cantidad = 0;
        for (Lugar l: lugares){
            cantidad += l.cantidadCartasRegalo(regalo);
        }
        return cantidad;
    }

    @Override
    public int cantidadCartas() {
        int cantidad = 0;
        for (Lugar l: lugares){
            cantidad += l.cantidadCartas();
        }
        return cantidad;
    }

    @Override
    public int cantidadNiniosMalos() {
        int cantidadMalos = 0;
        for (Lugar l: lugares){
            cantidadMalos += l.cantidadNiniosMalos();
        }
        return cantidadMalos;
    }
}
