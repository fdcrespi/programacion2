package ejercicio5.criterio;

import ejercicio5.ElementoFS;

public class CriterioNot implements Criterio{
    Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(ElementoFS elemento) {
        return !criterio.cumple(elemento);
    }
}
