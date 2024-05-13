package classes;

public class Retragere extends Template {
    @Override
    public boolean seIntroduceCardul(Client client) {
        if (client.isAreCard()) {
            System.out.println("Cardul a fost introdus cu succes");
            return true;
        } else {
            System.out.println("Va rugam introduceti cardul!");
            return false;
        }
    }

    @Override
    public boolean seSpecificaSumaSolicitata(Client client, int suma) {
        if (suma <= client.getSuma()) {
            System.out.println("Suma acceptata");
            return true;
        } else {
            System.out.println("Fonduri insuficiente");
            return false;
        }

    }

    @Override
    public void seRetragBanii() {
        System.out.println("Va rugam ridicati banii");

    }

    @Override
    public void seRetrageCardul() {
        System.out.println("Va rugam ridicati cardul");
    }
}
