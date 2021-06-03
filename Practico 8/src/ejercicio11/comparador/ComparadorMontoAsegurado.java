package ejercicio11.comparador;

import ejercicio11.Seguro;

import java.util.Comparator;

public class ComparadorMontoAsegurado implements Comparator<Seguro> {
    @Override
    public int compare(Seguro o1, Seguro o2) {
        return (int) (o1.getMonto()-o2.getMonto());
    }
}
