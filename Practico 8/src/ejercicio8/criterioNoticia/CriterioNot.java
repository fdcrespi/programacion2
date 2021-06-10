package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class CriterioNot implements CriterioNoticia{
    CriterioNoticia criterio;

    public CriterioNot(CriterioNoticia criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !criterio.cumple(noticia);
    }
}
