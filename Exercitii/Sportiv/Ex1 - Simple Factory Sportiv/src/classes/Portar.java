package classes;

public class Portar extends Sportiv{
    public Portar(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Portarul: " +getNume() + " are numarul " + getNumar());
    }
}
