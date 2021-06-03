package ejercicio7;

import java.time.LocalTime;

public abstract class LugarVoto {
    private int numero;

    public LugarVoto(int numero) {
        this.numero = numero;
    }

    public double porcentajeVotosCandidato(Candidato candidato){
        return totalVotosCandidato(candidato) * 100 / totalVotos();
    }

    public double porcentajeVotosEnBlanco(){
        return totalVotosEnBlanco() * 100 / totalVotos();
    }

    public double porcentajeVotosEntreHoras(LocalTime hora1, LocalTime hora2){
        return totalVotosEntreHoras(hora1, hora2) * 100 / totalVotos();
    }

    public abstract int totalVotos();
    public abstract int totalVotosEnBlanco();
    public abstract int totalVotosEntreHoras(LocalTime hora1, LocalTime hora2);
    public abstract int totalVotosCandidato(Candidato candidato);
}
