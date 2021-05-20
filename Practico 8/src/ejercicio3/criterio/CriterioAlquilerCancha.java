package ejercicio3.criterio;

import ejercicio3.Socio;

public class CriterioAlquilerCancha implements Criterio{
    private int cancha;

    public CriterioAlquilerCancha(int cancha) {
        this.cancha = cancha;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.alquiloCancha(cancha);
    }
}
