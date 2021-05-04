package adicional.condiciones;

import adicional.Cliente;

public class CondicionAnd implements Condicion{
    Condicion condicion1;
    Condicion condicion2;

    public CondicionAnd(Condicion condicion1, Condicion condicion2){
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Cliente cliente) {
        return condicion1.cumple(cliente) && condicion2.cumple(cliente);
    }
}
