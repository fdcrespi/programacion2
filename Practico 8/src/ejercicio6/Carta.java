package ejercicio6;

import java.util.ArrayList;

public class Carta {
    private String remitente;
    private int dniRemitente;
    private ArrayList<String> regalos;
    private static final String regaloMalo = "Trozo de Carbon";

    public Carta(String remitente, int dni) {
        this.remitente = remitente;
        this.dniRemitente = dni;
        regalos = new ArrayList<>();
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public int getDniRemitente() {
        return dniRemitente;
    }

    public void setDniRemitente(int dniRemitente) {
        this.dniRemitente = dniRemitente;
    }

    public void addRegalo(String regalo){
        if (!regalos.contains(regalo))
            regalos.add(regalo);
    }

    public boolean tieneRegalo(String regalo) {
        return regalos.contains(regalo);
    }

    public void modificarCarta(){
        regalos.clear();
        regalos.add(regaloMalo);
    }
}
