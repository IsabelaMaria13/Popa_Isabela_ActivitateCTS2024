package classes;

public class VerificatorTribuna implements Verificator {
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagajul " + nume );
    }
}
