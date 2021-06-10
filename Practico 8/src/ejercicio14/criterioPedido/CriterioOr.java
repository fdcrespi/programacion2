package ejercicio14.criterioPedido;

import ejercicio14.Pedido;

public class CriterioOr implements CriterioPedido{
    CriterioPedido criterio1;
    CriterioPedido criterio2;

    public CriterioOr(CriterioPedido criterio1) {
        this.criterio1 = criterio1;
    }

    @Override
    public boolean cumple(Pedido p) {
        return criterio1.cumple(p) && criterio2.cumple(p);
    }
}
