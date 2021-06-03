package ejercicio11;

import ejercicio11.costoPoliza.CostoPoliza;
import ejercicio11.criterio.Criterio;

import java.util.ArrayList;

public class SeguroSimple extends Seguro{
    private int poliza;
    private String descripcion;
    private double monto;
    private CostoPoliza costo;

    public SeguroSimple(int dni, int poliza, String descripcion, double monto) {
        super(dni);
        this.poliza = poliza;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public CostoPoliza getCostoPoliza() {
        return costo;
    }

    public void setCosto(CostoPoliza costo) {
        this.costo = costo;
    }

    @Override
    public int getPoliza() {
        return poliza;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public ArrayList<Seguro> buscar(Criterio criterio) {
        ArrayList<Seguro> segurosCumplen = new ArrayList<>();
        if (criterio.cumple(this)){
            segurosCumplen.add(this);
        }
        return segurosCumplen;
    }

    @Override
    public boolean contieneNombre(String nombre) {
        return getDescripcion().contains(nombre);
    }

    @Override
    public double getCosto() {
        return costo.getCosto(this);
    }
}
