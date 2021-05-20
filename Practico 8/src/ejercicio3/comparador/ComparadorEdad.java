package ejercicio3.comparador;

import ejercicio3.Socio;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getEdad() - o2.getEdad();
    }
}
