package classes;

public class Libera implements State{
    protected Libera() {
    }

    @Override
    public void setState(MasaRestaurant masa) {
        masa.setState(this);
    }
}
