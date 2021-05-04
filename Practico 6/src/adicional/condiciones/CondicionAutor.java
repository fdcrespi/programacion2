package adicional.condiciones;

import adicional.Cliente;

public class CondicionAutor implements Condicion{
    private String autor;

    public CondicionAutor(String autor){
        this.autor = autor;
    }

    @Override
    public boolean cumple(Cliente cliente){
        return cliente.leGustaAutor(autor);
    }
}
