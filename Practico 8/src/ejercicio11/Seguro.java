package ejercicio11;

import ejercicio11.criterio.Criterio;

import java.util.ArrayList;;

public abstract class Seguro {
    private int dni;

    public Seguro(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public abstract int getPoliza();
    public abstract double getMonto();
    public abstract double getCosto();
    public abstract ArrayList<Seguro> buscar(Criterio criterio);
    public abstract boolean contieneNombre(String nombre);

    @Override
    public boolean equals(Object o) {
        try {
            Seguro seguro = (Seguro) o;
            return getPoliza() == seguro.getPoliza();
        }
        catch (Exception e){
            return false;
        }

    }
}
