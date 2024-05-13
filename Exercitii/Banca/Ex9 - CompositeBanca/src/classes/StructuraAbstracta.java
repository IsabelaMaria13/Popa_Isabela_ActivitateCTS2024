package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class StructuraAbstracta {
    private String denumire;

    public String getDenumire() {
        return denumire;
    }

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public abstract void adaugaStructura(StructuraAbstracta sa);

    public abstract void stergeStructura(StructuraAbstracta sa);

    public abstract void getStructura(int index);
    public abstract void afiseaza(String identare);

}
