package ejercicio5.comparador;

import ejercicio5.ElementoFS;
import ejercicio7.comparadorCandidato.ComparadorAgrupacion;
import ejercicio7.comparadorCandidato.ComparadorPartido;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<ElementoFS> {
    Comparator<ElementoFS> comparador1;
    Comparator<ElementoFS> comparador2;

    public ComparadorAnd(Comparator comparador1, Comparator comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(ElementoFS o1, ElementoFS o2) {
        if(comparador1.compare(o1,o2) == 0){
           return comparador2.compare(o1,o2);
        }
        return comparador1.compare(o1,o2);
    }
}
