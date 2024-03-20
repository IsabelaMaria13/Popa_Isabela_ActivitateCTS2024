package classes;

public class RestaurantBuilder extends BuilderAbstract{
    Meniu meniu = new Meniu();
    public RestaurantBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        meniu.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RestaurantBuilder setScauneErgonomice(boolean scauneErgonomice) {
        meniu.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RestaurantBuilder setDecorareaMesei(boolean scauneErgonomice) {
        meniu.setDecorareaMesei(scauneErgonomice);
        return this;
    }

    public RestaurantBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        meniu.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    @Override
    public Meniu build() {
        return meniu;
    }
}
