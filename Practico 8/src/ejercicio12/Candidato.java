package ejercicio12;

import ejercicio12.criterioAceptacion.CriterioAceptacion;

import java.util.Objects;

public class Candidato {
    private String nombre;
    private double sueldo;
    private String empresa;
    CriterioAceptacion criterioAceptacion;

    public Candidato(String nombre, double sueldo, String empresa) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public Candidato(String nombre, double sueldo, String empresa, CriterioAceptacion criterioAceptacion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.empresa = empresa;
        this.criterioAceptacion = criterioAceptacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public CriterioAceptacion getCriterioAceptacion() {
        return criterioAceptacion;
    }

    public void setCriterioAceptacion(CriterioAceptacion criterioAceptacion) {
        this.criterioAceptacion = criterioAceptacion;
    }

    public boolean aceptaOferta(OfertaLaboral oferta){
        if (criterioAceptacion == null){
            return true;
        }
        return criterioAceptacion.cumple(oferta);
    }

    @Override
    public boolean equals(Object o) {
        Candidato candidato = (Candidato) o;
        return getNombre().equals(candidato.getNombre());
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " Sueldo:" + sueldo + " Empresa:" + empresa;
    }
}
