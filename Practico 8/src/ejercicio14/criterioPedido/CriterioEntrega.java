package ejercicio14.criterioPedido;

import ejercicio14.Pedido;

import java.time.LocalDate;

public class CriterioEntrega implements CriterioPedido{
    private LocalDate fechaEntrega;

    public CriterioEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public boolean cumple(Pedido p) {
        return p.getFechaEntrega().equals(fechaEntrega);
    }
}
