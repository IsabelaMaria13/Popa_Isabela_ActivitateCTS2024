package classes;

import java.util.ArrayList;
import java.util.List;

public class Farmacie extends StructuraAbstracta{
    private List<StructuraAbstracta> sectiuni;
    public Farmacie(String nume) {
        super(nume);
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        sectiuni.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        sectiuni.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        return this.sectiuni.get(index);
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + super.getNume());
        for (int i = 0; i < sectiuni.size(); i++) {
            this.sectiuni.get(i).afiseaza(identare + " ");
        }
    }


}
