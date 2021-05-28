package ejercicio4.criterio;

import ejercicio4.Pelicula;

public class CriterioAnd implements Criterio{
    Criterio criterio1;
    Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return criterio1.cumple(peli) && criterio2.cumple(peli);
    }
}
