package app;

public class Cliente extends Tributario{
    private int dni;

    public Cliente(String nombre, int dni) {
        super(nombre, 0, false);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     *
     * @param c Comercio
     * @return Dado un comercio, devuelve si el Cliente puede o no asistir
     */
    public boolean puedeAsistir(Comercio c){
        if(isEspacioLibre()){
            if (!(c.isEspacioLibre())){
                return false;
            }
        }
        if (getMetrosCuadrados() > c.getMetrosCuadrados()){
            return false;
        }
        for (String p: protocolos) {
            if (!c.implementaProtocolo(p)){
                return false;
            }
        }
        return true;
    }
}
