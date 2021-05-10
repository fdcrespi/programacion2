package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionTituloContiene implements Condicion {
    private String titulo;

    public CondicionTituloContiene(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(titulo);
    }
}
