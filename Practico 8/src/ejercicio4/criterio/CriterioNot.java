package ejercicio4.criterio;

import ejercicio4.Pelicula;

public class CriterioNot implements Criterio{
    Criterio criterio;

    public CriterioNot(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Pelicula peli) {
        return !criterio.cumple(peli);
    }
}
