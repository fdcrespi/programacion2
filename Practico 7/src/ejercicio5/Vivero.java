package ejercicio5;
import ejercicio5.condicion.*;
import ejercicio5.comparador.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Vivero {

    ArrayList<Planta> plantas;

    public Vivero() {
        plantas = new ArrayList<Planta>();
    }

    public void addPlanta(Planta p){
        if (!(plantas.contains(p))) plantas.add(p);
    }

    public ArrayList<Planta> buscarPlantas(Condicion c){
        ArrayList<Planta> plantasCumplen = new ArrayList<Planta>();
        for (Planta p: plantas) {
            if(c.cumple(p)) plantasCumplen.add(p);
        }
        return plantasCumplen;
    }

    public ArrayList<Planta> buscarPlantasOrdenadas(Condicion c, Comparator comparador){
        ArrayList<Planta> plantasCumplen = new ArrayList<Planta>();
        plantasCumplen = buscarPlantas(c);
        Collections.sort(plantasCumplen, comparador);
        return plantasCumplen;
    }

    public static void main(String[] args) {
        Vivero vivero = new Vivero();
        Planta planta1 = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", true, 4, 3);
        planta1.addNombreVulgar("potus");
        planta1.addNombreVulgar("pothos");
        planta1.addNombreVulgar("potos");
        vivero.addPlanta(planta1);
        Planta planta2 = new Planta("Mentha", "Herbaceas vivaces", "Lamiaceae", "Monocotyledoneae", false, 8, 6);
        planta2.addNombreVulgar("menta");
        vivero.addPlanta(planta2);
        Planta planta3 = new Planta("Bambusoideae", "herbaceas", "arboles", "Arundinarieae", false, 6, 6);
        planta3.addNombreVulgar("bambu");
        vivero.addPlanta(planta3);

/*        CondicionNombreCientificoIncluye cientIncluye = new CondicionNombreCientificoIncluye("aureum");
        System.out.println(vivero.buscarPlantas(cientIncluye));
        System.out.println("------------------------------");
        CondicionPalabraVulgar palVulgar = new CondicionPalabraVulgar("potus");
        System.out.println(vivero.buscarPlantas(palVulgar));
        System.out.println("------------------------------");
        CondicionClasificacionIgual clasIgual = new CondicionClasificacionIgual("Epipremnum");
        System.out.println(vivero.buscarPlantas(clasIgual));
        System.out.println("------------------------------");
        CondicionSolSuperior condSolSup = new CondicionSolSuperior(5);
        CondicionRiegoInferior condRiegoInf = new CondicionRiegoInferior(3);
        CondicionAnd condAndRiegoSol = new CondicionAnd(condSolSup, condRiegoInf);
        System.out.println(vivero.buscarPlantas(condAndRiegoSol));
        System.out.println("------------------------------");
        CondicionSolInferior condSolInf = new CondicionSolInferior(4);
        CondicionRiegoSuperior condRiegoSup = new CondicionRiegoSuperior(4);
        CondicionAnd condSolyRiego = new CondicionAnd(condSolInf, condSolSup);
        System.out.println(vivero.buscarPlantas(condSolyRiego));
        System.out.println("------------------------------");
        CondicionEsInterior condInterior = new CondicionEsInterior();
        CondicionRiegoInferior riegoInf = new CondicionRiegoInferior(3);
        CondicionAnd intPocoRiego = new CondicionAnd(condInterior, riegoInf);
        System.out.println(vivero.buscarPlantas(intPocoRiego));*/
        System.out.println("-------------- ORDEN ----------------");
        CondicionNombreCientificoIncluye cientIncluye = new CondicionNombreCientificoIncluye("e");
        System.out.println(vivero.buscarPlantas(cientIncluye));
        System.out.println(vivero.buscarPlantasOrdenadas(cientIncluye, new ComparadorVarios(new ComparadorRiego(), new ComparadorVarios(new ComparadorSol(), new ComparadorNombre()))));
    }
}
