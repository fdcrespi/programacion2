package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionPalabraVulgar implements Condicion{
    private String nombre;

    public CondicionPalabraVulgar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.contieneNombreVulgar(getNombre());
    }
}
