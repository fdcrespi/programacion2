package ejercicio2.comparador;

import ejercicio2.Palabra;

import java.util.Comparator;

public class ComparadorFrecuencia implements Comparator<Palabra> {

    @Override
    public int compare(Palabra o1, Palabra o2) {
        return o2.getFrecuencia() - o1.getFrecuencia();
    }
}
