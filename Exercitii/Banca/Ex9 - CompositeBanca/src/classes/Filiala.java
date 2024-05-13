package classes;

import java.util.ArrayList;
import java.util.List;

public class Filiala extends StructuraAbstracta{
    private int nrAngajati;

    public Filiala(String denumire, int nrAngajati) {
        super(denumire);
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + super.getDenumire());

    }
}
