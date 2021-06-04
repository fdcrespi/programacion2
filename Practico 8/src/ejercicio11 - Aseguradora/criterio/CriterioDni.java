package ejercicio11.criterio;

import ejercicio11.Seguro;

public class CriterioDni implements Criterio{
    private int dni;

    public CriterioDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDni() == dni;
    }
}
