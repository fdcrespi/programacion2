package ejercicio4.condicion;

import ejercicio4.Documento;

public class CondicionTituloIgual implements Condicion{
    public String titulo;

    public CondicionTituloIgual(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().equals(titulo);
    }
}
