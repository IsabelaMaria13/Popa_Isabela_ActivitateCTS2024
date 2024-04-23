package classes;

public class Card implements ModPlata {
    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println(numeClient + " plateste card suma de: " + sumaDePlata);
    }
}
