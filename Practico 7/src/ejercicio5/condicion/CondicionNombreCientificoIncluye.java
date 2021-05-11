package ejercicio5.condicion;

import ejercicio5.Planta;

public class CondicionNombreCientificoIncluye implements Condicion{
    private String texto;

    public CondicionNombreCientificoIncluye(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(getTexto());
    }
}
