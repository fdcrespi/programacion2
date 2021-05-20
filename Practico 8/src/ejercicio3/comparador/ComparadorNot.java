package ejercicio3.comparador;

import ejercicio3.Socio;
import ejercicio3.criterio.Criterio;

import java.util.Comparator;

public class ComparadorNot implements Comparator<Socio> {
    Comparator<Socio> comparador;

    public ComparadorNot(Comparator<Socio> comparador) {
        this.comparador = comparador;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return comparador.compare(o1, o2) * -1;
    }
}
