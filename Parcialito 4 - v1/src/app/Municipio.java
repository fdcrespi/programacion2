package app;

import criterio.*;

import java.util.ArrayList;

public class Municipio {
    private ArrayList<Comercio> comercios;

    public Municipio(){
        comercios = new ArrayList<>();
    }

    public void addComercio(Comercio c){
        if(!comercios.contains(c)){
            comercios.add(c);
        }
    }

    public ArrayList<Comercio> buscarComercio(Criterio c){
        ArrayList<Comercio> comerciosOk = new ArrayList<>();
        for (Comercio comer: comercios) {
            if(c.cumple(comer)){
                comerciosOk.add(comer);
            }
        }
        return comerciosOk;
    }

    public ArrayList<Comercio> buscarComercio(Cliente cli){
        ArrayList<Comercio> comerciosOk = new ArrayList<>();
        for (Comercio comer: comercios) {
            if(cli.puedeAsistir(comer)){
                comerciosOk.add(comer);
            }
        }
        return comerciosOk;
    }

    public boolean buscarComercio(Cliente cli, Comercio comer){
        return cli.puedeAsistir(comer);
    }

    public ArrayList<Comercio> comerciosConSuperfieMayor(int sup){
        CriterioMetrosCuadradosMayor criterio = new CriterioMetrosCuadradosMayor(sup);
        return buscarComercio(criterio);
    }

    public ArrayList<Comercio> comerciosDeRubro(String rubro){
        CriterioRubro criterio = new CriterioRubro(rubro);
        return buscarComercio(criterio);
    }

    public ArrayList<Comercio> comercionConProtocolo(String protocolo) {
        CriterioImplementaProtocolo criterio = new CriterioImplementaProtocolo(protocolo);
        return buscarComercio(criterio);
    }

    public ArrayList<Comercio> comercioNombreRubro(String nombre, String rubro) {
        CriterioAnd criterio = new CriterioAnd(new CriterioNombre(nombre), new CriterioRubro(rubro));
        return buscarComercio(criterio);
    }

    public ArrayList<Comercio> comercioNombreDistinto(String nombre){
        CriterioNot criterio = new CriterioNot(new CriterioNombre(nombre));
        return buscarComercio(criterio);
    }

    public ArrayList<Comercio> comerciosRubros(String rubro1, String rubro2){
        CriterioOr criterio = new CriterioOr(new CriterioRubro(rubro1), new CriterioRubro(rubro2));
        return buscarComercio(criterio);
    }
}
