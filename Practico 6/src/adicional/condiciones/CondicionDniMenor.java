package adicional.condiciones;

import adicional.Cliente;

public class CondicionDniMenor implements Condicion{
   private int dni;

   public CondicionDniMenor(int dni){
       this.dni = dni;
   }

    @Override
    public boolean cumple(Cliente cliente) {
        return cliente.getDni() <= dni;
    }
}
