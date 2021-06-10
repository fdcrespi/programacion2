package ejercicio11;

import ejercicio11.criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class SeguroTemporal extends Seguro{
    private LocalDate inicio;
    private LocalDate fin;
    private Seguro seguroContenido;

    public SeguroTemporal(int dni, LocalDate inicio, LocalDate fin, Seguro seguroContenido) {
        super(dni);
        this.inicio = inicio;
        this.fin = fin;
        this.seguroContenido = seguroContenido;
    }

    @Override
    public int getPoliza() {
        return seguroContenido.getPoliza();
    }

    @Override
    public double getMonto() {
        if(estaVigente()){
            return seguroContenido.getMonto();
        }
        return 0;
    }

    public boolean estaVigente(){
        return LocalDate.now().isAfter(inicio) && LocalDate.now().isBefore(fin);
    }

    @Override
    public ArrayList<Seguro> buscar(Criterio criterio) {
        ArrayList<Seguro> segurosCumplen = new ArrayList<>();
        if (estaVigente()){
            segurosCumplen.addAll(seguroContenido.buscar(criterio));
        }
        return segurosCumplen;
    }

    @Override
    public boolean contieneNombre(String nombre) {
        return seguroContenido.contieneNombre(nombre);
    }

    @Override
    public double getCosto() {
        return seguroContenido.getMonto();
    }
}
