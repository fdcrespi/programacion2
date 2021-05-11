package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionRiegoSuperior implements Condicion{
    private int riego;

    public CondicionRiegoSuperior(int riego) {
        this.riego = riego;
    }

    public int getRiego() {
        return riego;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getRiego() > getRiego();
    }
}
