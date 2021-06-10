package ejercicio12;

public class OfertaLaboral {
    private int horasSemanales;
    private double monto;
    private String empresa;

    public OfertaLaboral(int horasSemanales, double monto, String empresa) {
        this.horasSemanales = horasSemanales;
        this.monto = monto;
        this.empresa = empresa;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
