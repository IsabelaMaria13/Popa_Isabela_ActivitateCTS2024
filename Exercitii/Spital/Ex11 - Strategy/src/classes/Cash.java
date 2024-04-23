package classes;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println(numeClient + " plateste cash suma de: " + sumaDePlata);
    }
}
