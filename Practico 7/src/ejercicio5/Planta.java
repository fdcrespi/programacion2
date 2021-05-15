package ejercicio5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Planta{
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private boolean esInterior;
    private int sol;
    private int riego;
    private final static int requerimientoMinimo = 1;
    private final static int requerimientoMaximo = 10;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, boolean esInterior, int sol, int riego) {
        this.nombreCientifico = nombreCientifico.toLowerCase();
        this.nombresVulgares = new ArrayList<String>();
        this.clasificacionSuperior = clasificacionSuperior.toLowerCase();
        this.familia = familia.toLowerCase();
        this.clase = clase.toLowerCase();
        this.esInterior = esInterior;
        this.sol = comprobarRequerimiento(sol);
        this.riego = comprobarRequerimiento(riego);
    }

    private int comprobarRequerimiento(int req){
        if (req >= requerimientoMinimo && req <= requerimientoMaximo){
            return req;
        } return 1;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico.toLowerCase();
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior.toLowerCase();
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia.toLowerCase();
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase.toLowerCase();
    }

    public boolean isInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = comprobarRequerimiento(sol);
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = comprobarRequerimiento(riego);
    }

    public void addNombreVulgar(String nombre){
        if(!nombresVulgares.contains(nombre.toLowerCase())) nombresVulgares.add(nombre.toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        try {
            Planta planta = (Planta) o;
            return getNombreCientifico().equals(planta.getNombreCientifico());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombre='" + nombreCientifico + '\'' +
                " Riego=" + riego + " Sol="+sol +
                '}';
    }

    public boolean contieneNombreVulgar(String nombre){
        return nombresVulgares.contains(nombre.toLowerCase());
    }

/*    @Override
    public int compareTo(Planta o) {
        if(getSol() - o.getSol() == 0){
            if(getRiego() - o.getRiego() == 0){
                return getNombreCientifico().compareTo(o.getNombreCientifico());
            }
            return getRiego() - o.getRiego();
        }
        return getSol() - o.getSol();
    }*/
}
