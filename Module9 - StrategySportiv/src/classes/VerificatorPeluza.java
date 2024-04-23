package classes;

public class VerificatorPeluza implements Verificator {
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagaje si hainele " + nume);
    }
}
