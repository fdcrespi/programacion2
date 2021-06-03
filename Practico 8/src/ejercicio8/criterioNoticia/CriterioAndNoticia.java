package ejercicio8.criterioNoticia;

import ejercicio8.Noticia;

public class CriterioAndNoticia implements CriterioNoticia{
    CriterioNoticia criterio1;
    CriterioNoticia criterio2;

    public CriterioAndNoticia(CriterioNoticia criterio1, CriterioNoticia criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return criterio1.cumple(noticia) && criterio2.cumple(noticia);
    }
}
