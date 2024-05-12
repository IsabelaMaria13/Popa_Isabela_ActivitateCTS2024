package classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstractaSectie{
    private List<StructuraAbstractaSectie> structuri;
    private String directorDepartament;
    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstractaSectie sa) {
        this.structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstractaSectie sa) {
        this.structuri.remove(sa);
    }

    @Override
    public StructuraAbstractaSectie getStructura(int index) {
        return this.structuri.get(index);
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + "Departamentul " + super.getNume() + " este condus de " +
                this.directorDepartament + " si are urm componenta: ");
        for(int i = 0; i < this.structuri.size(); i++){
            this.structuri.get(i).afiseazaDescriere(identare + " ");
        }
    }
}
