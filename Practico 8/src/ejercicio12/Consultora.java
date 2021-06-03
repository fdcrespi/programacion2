package ejercicio12;

import ejercicio12.criterioAceptacion.*;

import java.util.ArrayList;

public class Consultora {
    private ArrayList<Candidato> candidatos;

    public Consultora() {
        candidatos = new ArrayList<>();
    }

    public void addCandidato(Candidato c){
        if(!candidatos.contains(c)){
            candidatos.add(c);
        }
    }

    private ArrayList<Candidato> potencialesCandidatos(OfertaLaboral oferta){
        ArrayList<Candidato> candidatosSi = new ArrayList<>();
        for (Candidato c: candidatos) {
            if (c.aceptaOferta(oferta)){
                candidatosSi.add(c);
            }
        }
        return candidatosSi;
    }

    public static void main(String[] args) {
        Consultora consultora = new Consultora();
        OfertaLaboral oferta = new OfertaLaboral(49, 100000, "CELTA");

        CriterioAceptacion criterioC1 = new CriterioExclusivo();
        Candidato fede = new Candidato("Federico", 90000, "CELTA", criterioC1);

        Candidato guido = new Candidato("Guido", 95000, "Registro");
        guido.setCriterioAceptacion(new CriterioMontoMayor(guido.getSueldo()));

        Candidato cris = new Candidato("Cristian", 120000, "FAVACARD");
        cris.setCriterioAceptacion(new CriterioOr(new CriterioHorasMenos(56), new CriterioMontoMayor(150000)));

        Candidato juan = new Candidato("Juan", 130000, "FAVACARD");
        juan.setCriterioAceptacion(new CriterioNot(new CriterioEmpresaIgual(juan.getEmpresa())));

        consultora.addCandidato(fede);
        consultora.addCandidato(guido);
        consultora.addCandidato(cris);
        consultora.addCandidato(juan);
        consultora.addCandidato(fede);

        System.out.println(consultora.potencialesCandidatos(oferta));
    }
}
