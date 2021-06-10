package App.criterio;

import App.ElementoLibreria;

public class CriterioPrecioMenor implements CriterioElemento{
    private double precio;

    public CriterioPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return elemento.getPrecio()<precio;
    }
}
