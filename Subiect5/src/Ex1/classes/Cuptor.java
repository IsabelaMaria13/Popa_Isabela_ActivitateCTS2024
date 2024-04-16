package Ex1.classes;

import java.util.LinkedList;
import java.util.Queue;

public class Cuptor {
    private static Cuptor instance;
    private Queue<Preparat> listaAsteptare;

    public Queue<Preparat> getListaAsteptare() {
        return listaAsteptare;
    }

    private Cuptor() {
        this.listaAsteptare = new LinkedList<>();
    }
    public static synchronized Cuptor getInstance(){
        if(instance == null){
            instance = new Cuptor();
        }
        return instance;
    }
    public void adaugaPreparat(Preparat preparat){
        listaAsteptare.add(preparat);
    }
    public void gatestePreparat(){
        if(!listaAsteptare.isEmpty()){
            Preparat preparat = listaAsteptare.poll();
            System.out.println("Gătirea preparatului: " + preparat.getNume() + " la gradele: " + preparat.getGrade() + " timp de: " + preparat.getTimp());
        }
    }
}
