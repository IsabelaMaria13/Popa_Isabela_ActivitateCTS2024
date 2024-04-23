package classes;

public class VerificatorVIP implements Verificator {
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica biletul " + nume);
    }
}
