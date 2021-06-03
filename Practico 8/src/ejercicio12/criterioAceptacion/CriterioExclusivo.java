package ejercicio12.criterioAceptacion;

import ejercicio12.Candidato;
import ejercicio12.OfertaLaboral;

public class CriterioExclusivo implements CriterioAceptacion{

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return false;
    }
}
