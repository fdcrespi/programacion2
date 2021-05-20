package ejercicio2.criterio;

import ejercicio2.Ficha;

public class CriterioPoderMayor implements Criterio{
    private int poder;

    public CriterioPoderMayor(int poder) {
        this.poder = poder;
    }

    @Override
    public boolean cumple(Ficha f) {
        return f.getPoderDestruccion() > poder;
    }
}
