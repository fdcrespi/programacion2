package ejercicio7;

import java.time.LocalTime;

public class Voto {
    Candidato candidato;
    LocalTime hora;

    public Voto(Candidato candidato) {
        this.candidato = candidato;
    }

    public Voto(){
        candidato = null;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
