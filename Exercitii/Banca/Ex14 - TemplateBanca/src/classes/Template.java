package classes;

public abstract class Template {
    public final void retragere(Client client, int suma) {
        if (seIntroduceCardul(client)) {
            if (seSpecificaSumaSolicitata(client, suma)) {
                seRetragBanii();
                seRetrageCardul();
            }
        }
    }

    public abstract boolean seIntroduceCardul(Client client);

    public abstract boolean seSpecificaSumaSolicitata(Client client, int suma);

    public abstract void seRetragBanii();

    public abstract void seRetrageCardul();
}
