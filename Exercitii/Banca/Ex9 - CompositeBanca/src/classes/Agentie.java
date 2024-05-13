package classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends StructuraAbstracta{
    private int nrAngajati;
    List<StructuraAbstracta> structuri;

    public Agentie(String denumire, int nrAngajati) {
        super(denumire);
        structuri = new ArrayList<>();
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        structuri.remove(sa);
    }

    @Override
    public void getStructura(int index) {
        structuri.get(index);
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + super.getDenumire());
        for (int i = 0; i < structuri.size(); i++) {
            structuri.get(i).afiseaza(identare + " ");
        }
    }
}
