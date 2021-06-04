package ejercicio3.comparador;

import ejercicio3.Socio;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Socio> {
    Comparator<Socio> comparador1;
    Comparator<Socio> comparador2;

    public ComparadorAnd(Comparator<Socio> comparador1, Comparator<Socio> comparador2) {
        this.comparador1 = comparador1;
        this.comparador2 = comparador2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
      if (comparador1.compare(o1,o2) == 0) {
          return comparador2.compare(o1, o2);
      }
      return comparador1.compare(o1,o2);
    }
}
