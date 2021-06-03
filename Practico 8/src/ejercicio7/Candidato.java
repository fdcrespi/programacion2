package ejercicio7;

import java.util.Objects;

public class Candidato{
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    @Override
    public boolean equals(Object o) {
        Candidato candidato = (Candidato) o;
        return getNombre().equals(candidato.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " partido:"+ partidoPolitico + " agrupacion:" + agrupacion + "\n";
    }

    /*    @Override
    public int compareTo(Candidato o) {
        if(getPartidoPolitico().compareTo(o.getPartidoPolitico()) == 0){
            if (getAgrupacion().compareTo(o.getAgrupacion()) == 0){
                return (getNombre().compareTo(o.getNombre()));
            }
            return getAgrupacion().compareTo(o.getAgrupacion());
        } return getPartidoPolitico().compareTo(o.getPartidoPolitico());
    }*/
}
