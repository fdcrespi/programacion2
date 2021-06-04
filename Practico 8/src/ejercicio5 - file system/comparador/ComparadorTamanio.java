package ejercicio5.comparador;

import ejercicio5.ElementoFS;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<ElementoFS> {
    @Override
    public int compare(ElementoFS o1, ElementoFS o2) {
        return (int) (o1.getTamanio()-o2.getTamanio());
    }
}
