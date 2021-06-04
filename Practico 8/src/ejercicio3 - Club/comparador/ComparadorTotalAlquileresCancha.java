package ejercicio3.comparador;

import ejercicio3.Socio;

import java.util.Comparator;

public class ComparadorTotalAlquileresCancha implements Comparator<Socio> {
    private int cancha;

    public ComparadorTotalAlquileresCancha(int cancha) {
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.totalAlquileresCancha(cancha) - o2.totalAlquileresCancha(cancha);
    }
}
