package ejercicio12.criterioAceptacion;

import ejercicio12.OfertaLaboral;

public class CriterioEmpresaIgual implements CriterioAceptacion{
    private String empresa;

    public CriterioEmpresaIgual(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean cumple(OfertaLaboral oferta) {
        return oferta.getEmpresa().equals(empresa);
    }
}
