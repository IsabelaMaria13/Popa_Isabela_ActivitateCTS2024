package classes;

public class Subsectiune extends StructuraAbstracta{
    public Subsectiune(String nume) {
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
    public void afiseaza(String identare) {
        System.out.println(identare + super.getNume());

    }
}
