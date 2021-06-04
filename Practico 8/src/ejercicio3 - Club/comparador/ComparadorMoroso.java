package ejercicio3.comparador;

import ejercicio3.Socio;

import java.util.Comparator;

public class ComparadorMoroso implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        if (o1.isAldia() && !o2.isAldia()){
            return -1;
        } else if (!o1.isAldia() && o2.isAldia()){
            return 1;
        }
        return 0;
    }
}
