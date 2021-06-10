package ejercicio10.criterio;

import ejercicio10.Tarea;

public class CriterioAnd implements Criterio{
    private Criterio criterio1;
    private Criterio criterio2;

    public CriterioAnd(Criterio criterio1, Criterio criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Tarea t) {
        return criterio1.cumple(t) && criterio2.cumple(t);
    }
}
