package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionAnd implements Condicion{
    private Condicion cond1;
    private Condicion cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Planta p) {
        return cond1.cumple(p) && cond2.cumple(p);
    }
}
