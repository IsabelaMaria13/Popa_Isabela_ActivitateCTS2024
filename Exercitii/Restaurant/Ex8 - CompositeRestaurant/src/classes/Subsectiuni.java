package classes;

public class Subsectiuni extends StructuraAbstracta{
    public Subsectiuni(String nume) {
        super(nume);
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
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare + super.getNume());
    }
}
