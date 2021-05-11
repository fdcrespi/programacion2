package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionEsInterior implements Condicion{

    @Override
    public boolean cumple(Planta p) {
        return p.isInterior();
    }
}
