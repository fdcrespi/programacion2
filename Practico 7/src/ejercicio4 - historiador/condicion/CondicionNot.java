package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionNot implements Condicion{
    Condicion condicion;

    public CondicionNot(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public boolean cumple(Documento documento) {
        return !condicion.cumple(documento);
    }
}
