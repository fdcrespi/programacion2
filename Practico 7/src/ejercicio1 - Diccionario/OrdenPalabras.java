package ejercicio1;

import java.util.Comparator;

public class OrdenPalabras implements Comparator<Palabra> {

    public OrdenPalabras() {
    }

    @Override
    public int compare(Palabra o1, Palabra o2) {
        return o1.getEscritura().compareTo(o2.getEscritura());
    }
}
