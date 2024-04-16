package classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
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
        if (index >= 0 && index < this.structuri.size()) {
            return this.structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Departamentul " + super.getNume() + " este condus de "
                + this.directorDepartament + " si are urmatoarea componenta: ");
        for (int i = 0; i < this.structuri.size(); i++) {
            this.structuri.get(i).afiseazaDescriere(identare + " ");
        }

    }
}
