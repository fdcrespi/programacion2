package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionSinPalabraClave implements Condicion{
    @Override
    public boolean cumple(Documento documento) {
        return documento.sinPalabrasClaves();
    }
}
