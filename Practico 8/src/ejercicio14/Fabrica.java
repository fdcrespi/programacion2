package ejercicio14;

import ejercicio14.criterioPedido.CriterioPedido;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Pedido> pedidos;
    private CriterioPedido criterio;
    private Fabrica fabricaCercana;

    public Fabrica(CriterioPedido criterio) {
        this.criterio = criterio;
        pedidos = new ArrayList<>();
    }

    private void addPedido(Pedido p){
        if(!pedidos.contains(p)){
            pedidos.add(p);
        }
    }

    public void setCriterio(CriterioPedido criterio) {
        this.criterio = criterio;
    }

    public void atenderPedido(Pedido p){
        if(criterio.cumple(p)){
           addPedido(p);
        } else {
            fabricaCercana.atenderPedido(p);
        }
    }
}
