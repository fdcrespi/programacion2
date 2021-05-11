package ejercicio5.comparador;

import ejercicio5.Planta;

import java.util.Comparator;

public class ComparadorSol implements Comparator<Planta> {

    @Override
    public int compare(Planta o1, Planta o2) {
        return o1.getSol()-o2.getSol();
    }
}
