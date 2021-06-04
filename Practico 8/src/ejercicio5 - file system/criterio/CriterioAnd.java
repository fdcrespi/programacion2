package ejercicio5.criterio;

import ejercicio5.ElementoFS;

public class CriterioAnd implements Criterio{
    Criterio criterio1;
    Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return criterio1.cumple(elemento) && criterio2.cumple(elemento);
    }
}
