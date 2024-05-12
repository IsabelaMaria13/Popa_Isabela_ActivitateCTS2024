package classes;

public abstract class StructuraAbstractaSectie {
    private String nume;

    public StructuraAbstractaSectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugaStructura(StructuraAbstractaSectie sa);

    public abstract void stergeStructura(StructuraAbstractaSectie sa);

    public abstract StructuraAbstractaSectie getStructura(int index);

    public abstract void afiseazaDescriere(String identare);
}
