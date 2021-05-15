package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionContenidoMasPalabras implements Condicion{
    private static int minPalabras = 20;

    public CondicionContenidoMasPalabras() {
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.cantidadPalabrasContenido() > minPalabras;
    }
}
