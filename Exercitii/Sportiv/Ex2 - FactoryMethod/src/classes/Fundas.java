package classes;

public class Fundas extends Sportiv{
    public Fundas(String nume, int numar) {
        super(nume, numar);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Fundasul: " +getNume() + " are numarul " + getNumar());
    }
}
