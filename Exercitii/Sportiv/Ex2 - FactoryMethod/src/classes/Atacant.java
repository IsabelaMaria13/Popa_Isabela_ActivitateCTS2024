package classes;

public class Atacant extends Sportiv{
    public Atacant(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Atacantul: " +getNume() + " are numarul " + getNumar());
    }
}
