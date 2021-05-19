package ejercicio2;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;

    public Tablero(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        fichas = new ArrayList<>();
    }

    public double getDificultad(){
        int fortaleza = 0;
        int destruccion = 0;
        for (Ficha f: fichas) {
            fortaleza += f.getFortaleza();
            destruccion += f.getPoderDestruccion();
        }
        return fortaleza / destruccion;
    }
}
