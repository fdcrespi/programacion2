package ejercicio11.costoPoliza;

import ejercicio11.Seguro;

public class Porcentaje implements CostoPoliza{
    private double porcentaje;

    public Porcentaje(double porcentaje, Seguro seguro) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getCosto(Seguro s) {
        return s.getMonto() * porcentaje/100;
    }
}
