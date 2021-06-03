package ejercicio11.comparador;

import ejercicio11.Seguro;

import java.util.Comparator;

public class ComparadorPoliza implements Comparator<Seguro> {
    @Override
    public int compare(Seguro o1, Seguro o2) {
        return o1.getPoliza()-o2.getPoliza();
    }
}
