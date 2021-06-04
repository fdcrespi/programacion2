package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionSolSuperior implements Condicion{
    public int sol;

    public CondicionSolSuperior(int sol) {
        this.sol = sol;
    }

    public int getSol() {
        return sol;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getSol() > getSol();
    }
}
