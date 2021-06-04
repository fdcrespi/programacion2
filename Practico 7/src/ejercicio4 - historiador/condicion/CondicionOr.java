package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionOr implements Condicion{
    Condicion condicion1;
    Condicion condicion2;

    public CondicionOr(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Documento documento) {
        return condicion1.cumple(documento) || condicion2.cumple(documento);
    }
}
