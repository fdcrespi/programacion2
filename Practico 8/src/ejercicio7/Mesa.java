package ejercicio7;

import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends LugarVoto{
    private ArrayList<Integer> padron;
    private ArrayList<Voto> votos;

    public Mesa(int numero) {
        super(numero);
        padron = new ArrayList<>();
        votos = new ArrayList<>();
    }

    public void addVotante(int dni){
        if(!padron.contains(dni))
            padron.add(dni);
    }

    public void addVoto(Voto voto, int dni){
        if (padron.contains(dni)) {
            votos.add(voto);
            voto.setHora(LocalTime.now());
        }
    }

    @Override
    public int totalVotos() {
        return votos.size();
    }

    @Override
    public int totalVotosEnBlanco() {
        int cantidad = 0;
        for (Voto v: votos) {
            if (v.getCandidato() != null)
                cantidad++;
        }
        return cantidad;
    }

    @Override
    public int totalVotosEntreHoras(LocalTime hora1, LocalTime hora2) {
        int cantidad = 0;
        for (Voto v: votos) {
            if ((v.getHora().compareTo(hora1)>=0) && (v.getHora().compareTo(hora2)<=0)){
                cantidad++;
            }
        }
        return cantidad;
    }

    @Override
    public int totalVotosCandidato(Candidato candidato) {
        int cantidad = 0;
        for (Voto v: votos) {
            //TODO ¿puedo comparar candidatos? ¿ó el nombre?
            if(v.getCandidato().equals(candidato)){
                cantidad++;
            }
        }
        return cantidad;
    }
}
