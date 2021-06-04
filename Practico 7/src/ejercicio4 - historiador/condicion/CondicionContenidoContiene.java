package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionContenidoContiene implements Condicion{
    private String palabra;

    public CondicionContenidoContiene(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.contieneContenido(palabra);
    }
}
