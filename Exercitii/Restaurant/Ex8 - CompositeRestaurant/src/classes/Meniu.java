package classes;

import java.util.ArrayList;
import java.util.List;

public class Meniu extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;

    public Meniu(String nume) {
        super(nume);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        this.structuri.add(sa);

    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        this.structuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        return this.structuri.get(index);
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + super.getNume());
        for (int i =0;i<this.structuri.size();i++){
           this.structuri.get(i).afiseazaDescriere(identare + " ");
        }

    }
}
