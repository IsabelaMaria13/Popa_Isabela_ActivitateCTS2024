package classes;

public class Sectie extends StructuraAbstractaSectie {
    private int nrAngajati;
    private String sefSectie;

    public Sectie(String nume, int nrAngajati, String sefSectie) {
        super(nume);
        this.nrAngajati = nrAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaStructura(StructuraAbstractaSectie sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstractaSectie sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstractaSectie getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + " sectia " + super.getNume() +
                " este condusa de " + this.sefSectie + " si are " + this.nrAngajati + " angajati.");
    }
}
