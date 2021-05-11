package ejercicio5.comparador;

import ejercicio5.Planta;

import java.util.Comparator;

public class ComparadorVarios implements Comparator<Planta> {
    private Comparator comparador1;
    private Comparator comparador2;

    public ComparadorVarios(Comparator comparador1, Comparator comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Planta o1, Planta o2) {
        if (comparador1.compare(o1, o2) == 0){
            return comparador2.compare(o1,o2);
        }
        return comparador1.compare(o1,o2);
    }
}
