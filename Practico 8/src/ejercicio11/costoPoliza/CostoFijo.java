package ejercicio11.costoPoliza;

import ejercicio11.Seguro;

public class CostoFijo implements CostoPoliza{
    private double costo;

    public CostoFijo(double monto) {
        this.costo = monto;
    }

    @Override
    public double getCosto(Seguro s) {
        return costo;
    }
}
