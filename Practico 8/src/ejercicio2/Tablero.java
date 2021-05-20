package ejercicio2;

import ejercicio2.criterio.*;

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

    public void addFicha(Ficha f){
        fichas.add(f);
    }

    public ArrayList<Ficha> poderDestruccionMayor(int numero){
        Criterio poderMayor = new CriterioPoderMayor(numero);
        return buscarFichas(poderMayor);
    }

    public ArrayList<Ficha> ocupacionMayor(int numero){
        Criterio ocupacionMayor = new CriterioOcupacionMayor(numero);
        return buscarFichas(ocupacionMayor);
    }

    public ArrayList<Ficha> fortalezaMayor(int numero){
        Criterio fortalezaMayor = new CriterioFortalezaMayor(numero);
        return buscarFichas(fortalezaMayor);
    }

    public ArrayList<Ficha> buscarFichas(Criterio c){
        ArrayList<Ficha> fichasCumplen = new ArrayList<>();
        for (Ficha f: fichas) {
            if (c.cumple(f)) fichasCumplen.add(f);
        }
        return fichasCumplen;
    }
}
