package ejercicio5.comparador;

import ejercicio5.ElementoFS;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElementoFS> {
    @Override
    public int compare(ElementoFS o1, ElementoFS o2) {
        return o1.getCreacion().compareTo(o2.getCreacion());
    }
}
