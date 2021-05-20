package ejercicio3.criterio;

import ejercicio3.Socio;

public class CriterioMayorEdad implements Criterio{
    @Override
    public boolean cumple(Socio s) {
        return !s.esMayor();
    }
}
