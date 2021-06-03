package ejercicio7;

import java.time.LocalTime;
import java.util.ArrayList;

public class Distrito extends LugarVoto{
    private ArrayList<LugarVoto> lugares;

    public Distrito(int numero) {
        super(numero);
        lugares = new ArrayList<>();
    }

    @Override
    public int totalVotos() {
        int cantidad = 0;
        for(LugarVoto l: lugares){
            cantidad += l.totalVotos();
        }
        return cantidad;
    }

    @Override
    public int totalVotosEnBlanco() {
        int cantidad = 0;
        for(LugarVoto l: lugares){
            cantidad += l.totalVotosEnBlanco();
        }
        return cantidad;
    }

    @Override
    public int totalVotosEntreHoras(LocalTime hora1, LocalTime hora2) {
        int cantidad = 0;
        for (LugarVoto l: lugares){
            cantidad += l.totalVotosEntreHoras(hora1, hora2);
        }
        return cantidad;
    }

    @Override
    public int totalVotosCandidato(Candidato candidato) {
        int cantidad = 0;
        for (LugarVoto l: lugares){
            cantidad += l.totalVotosCandidato(candidato);
        }
        return cantidad;
    }
}
