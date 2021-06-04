package ejercicio14.criterioPedido;

import ejercicio14.Pedido;

import java.util.Locale;

public class CriterioMaterial implements CriterioPedido{
    private String material;

    public CriterioMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean cumple(Pedido p) {
        return p.getMaterial().toLowerCase().equals(material.toLowerCase());
    }
}
