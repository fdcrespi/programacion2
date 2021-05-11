package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionNot implements Condicion{
    private Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Planta p) {
        return !condicion.cumple(p);
    }
}
