package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionContenidoMasPalabras implements Condicion{
    private final static int minPalabras = 20;

    public CondicionContenidoMasPalabras() {
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.cantidadPalabrasContenido() > minPalabras;
    }
}
