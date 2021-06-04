package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionSolInferior implements Condicion{
    private int sol;

    public CondicionSolInferior(int sol) {
        this.sol = sol;
    }

    public int getSol() {
        return sol;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol() < getSol();
    }
}
