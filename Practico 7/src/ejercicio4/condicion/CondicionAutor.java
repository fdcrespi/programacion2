package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionAutor implements Condicion{
    private String autor;

    public CondicionAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.contieneAutor(autor);
    }
}
