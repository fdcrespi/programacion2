package App.criterio;

import App.ElementoLibreria;

public class CriterioMarca implements CriterioElemento{
    private String marca;

    public CriterioMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean cumple(ElementoLibreria elemento) {
        return elemento.getMarca().toLowerCase().equals(marca.toLowerCase());
    }
}
