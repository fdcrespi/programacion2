package ejercicio14.criterioPedido;

import ejercicio14.Pedido;

public class CaracteristicaContiene implements CriterioPedido{
    private String caracteristica;

    public CaracteristicaContiene(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Pedido p) {
        return p.getCaracteristica().contains(caracteristica);
    }
}
