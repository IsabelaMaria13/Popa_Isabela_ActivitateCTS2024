package classes;

public class Rezervata implements State{
    protected Rezervata() {
    }

    @Override
    public void setState(MasaRestaurant masa) {
        masa.setState(this);
    }
}
