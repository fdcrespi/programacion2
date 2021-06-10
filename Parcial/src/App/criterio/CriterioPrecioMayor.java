package App.criterio;

import App.ElementoLibreria;

public class CriterioPrecioMayor implements CriterioElemento{
    private double precio;

    public CriterioPrecioMayor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return elemento.getPrecio()>precio;
    }
}
