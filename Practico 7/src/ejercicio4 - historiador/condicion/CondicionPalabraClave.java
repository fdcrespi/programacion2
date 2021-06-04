package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionPalabraClave implements Condicion{
    private String palabra;

    public CondicionPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.contienePalabraClave(palabra);
    }
}
