package Ex1.main;


import Ex1.classes.Cuptor;
import Ex1.classes.Preparat;

public class Main {
    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();
        cuptor.adaugaPreparat(new Preparat("Pizza", 20, 220));
        cuptor.adaugaPreparat(new Preparat("Lasagna", 30, 200));
        cuptor.adaugaPreparat(new Preparat("Paine cu masline", 45, 180));
        cuptor.adaugaPreparat(new Preparat("Briose", 25, 160));

        while (!cuptor.getListaAsteptare().isEmpty()){
            cuptor.gatestePreparat();
        }
    }
}