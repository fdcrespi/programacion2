package ejercicio1.criterio;

import ejercicio1.Agroquimico;
import ejercicio1.Enfermedad;

public class poseeEnfermedad implements Criterio {
    private Enfermedad enfermedad;

    public poseeEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public boolean cumple(Agroquimico a) {
        return a.trataEnfermedad(enfermedad);
    }
}
