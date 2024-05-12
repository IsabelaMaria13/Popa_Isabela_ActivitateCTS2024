package classes;

public abstract class Template {
    public final void sePregatesteMasa(MasaRestaurant masa) {
        seCurataMasa(masa);
        seAseazaServetele(masa);
        seAseazaTacamurile(masa);
        seInvitaPersoanele(masa);
    }

    protected abstract void seCurataMasa(MasaRestaurant masa);

    protected abstract void seAseazaServetele(MasaRestaurant masa);

    protected abstract void seAseazaTacamurile(MasaRestaurant masa);

    protected abstract void seInvitaPersoanele(MasaRestaurant masa);

}
