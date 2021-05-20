package ejercicio3.criterio;

import ejercicio3.Socio;

public class CriterioCuotaImpaga implements Criterio{
    @Override
    public boolean cumple(Socio s) {
        return !s.isAldia();
    }
}
