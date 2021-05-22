package app;

public class Comercio extends Tributario{

    private String rubro;

    public Comercio(String nombre, String rubro, double metrosCuadrados, boolean espacioLibre) {
        super(nombre, metrosCuadrados, espacioLibre);
        this.rubro = rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }


    //Se da por sentado que los comercios son iguales cuando tienen el mismo nombre y pertenecen al mismo rubro
    @Override
    public boolean equals(Object o) {
        Comercio comercio = (Comercio) o;
        return getNombre().equals(comercio.getNombre()) && getRubro().equals(comercio.getRubro());
    }

    @Override
    public String toString() {
        return "Nombre:" + getNombre() + " Rubro:" + getRubro();
    }


}
