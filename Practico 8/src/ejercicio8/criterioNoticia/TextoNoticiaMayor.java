package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class TextoNoticiaMayor implements CriterioNoticia{
    private int cantidad;

    public TextoNoticiaMayor(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > cantidad;
    }
}
