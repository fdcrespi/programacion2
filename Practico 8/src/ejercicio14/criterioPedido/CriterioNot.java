package ejercicio14.criterioPedido;

import ejercicio14.Pedido;

public class CriterioNot implements CriterioPedido{
    CriterioPedido criterio;

    public CriterioNot(CriterioPedido criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Pedido p) {
        return !criterio.cumple(p);
    }
}
