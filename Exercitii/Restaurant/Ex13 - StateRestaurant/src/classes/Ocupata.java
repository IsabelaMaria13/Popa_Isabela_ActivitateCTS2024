package classes;

public class Ocupata implements State{
    protected Ocupata() {
    }

    @Override
    public void setState(MasaRestaurant masa) {
        masa.setState(this);
    }
}
