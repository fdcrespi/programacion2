package ejercicio11.costoPoliza;

import ejercicio11.Seguro;

public class Varios implements CostoPoliza{
    CostoPoliza costo1;
    CostoPoliza costo2;

    public Varios(CostoPoliza costo1, CostoPoliza costo2) {
        this.costo1 = costo1;
        this.costo2 = costo2;
    }

    @Override
    public double getCosto(Seguro s) {
        return costo1.getCosto(s) + costo2.getCosto(s);
    }
}
