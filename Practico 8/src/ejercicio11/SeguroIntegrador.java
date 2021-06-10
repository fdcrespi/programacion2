package ejercicio11;

import ejercicio11.criterio.Criterio;

import java.util.ArrayList;

public class SeguroIntegrador extends Seguro{
    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(int dni) {
        super(dni);
    }

    public void addSeguro(Seguro seguro){
        if(!seguros.contains(seguro)){
            seguros.add(seguro);
        }
    }

    @Override
    public int getPoliza() {
        if(!seguros.isEmpty()){
            int polizaMayor = seguros.get(0).getPoliza();
            for (int i = 1; i < seguros.size(); i++) {
                int polizaActual = seguros.get(i).getPoliza();
                if (polizaActual > polizaMayor){
                    polizaMayor = polizaActual;
                }
            }
            return polizaMayor;
        }
        return 0;
    }

    @Override
    public double getMonto() {
        int suma = 0;
        for (Seguro s: seguros) {
            suma += s.getMonto();
        }
        return suma;
    }

    @Override
    public ArrayList<Seguro> buscar(Criterio criterio) {
        ArrayList<Seguro> segurosCumplen = new ArrayList<>();
        for (Seguro s: seguros) {
            if(criterio.cumple(s)){
                segurosCumplen.addAll(s.buscar(criterio));
            }
        }
        return segurosCumplen;
    }

    @Override
    public boolean contieneNombre(String nombre) {
        for (Seguro s: seguros) {
            if (s.contieneNombre(nombre)){
                return true;
            }
        }
        return false;
    }

    @Override
    public double getCosto() {
        double costo = 0;
        for (Seguro s: seguros) {
            costo += s.getCosto();
        }
        return costo;
    }
}
