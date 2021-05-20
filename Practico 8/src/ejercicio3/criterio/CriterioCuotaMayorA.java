package ejercicio3.criterio;

import ejercicio3.Socio;

public class CriterioCuotaMayorA implements Criterio{
    private double importe;

    public CriterioCuotaMayorA(double importe) {
        this.importe = importe;
    }

    @Override
    public boolean cumple(Socio s) {
        return s.precioCancha(importe);
    }
}
