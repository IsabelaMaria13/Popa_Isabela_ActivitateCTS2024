package classes.subject;

public class Stadion extends Subject {
    @Override
    public void notificaMeciFotbal() {
        super.trimiteNotificare("Pe stadion are loc un meci de fotbal");
    }

    @Override
    public void notificaMeciHandbal() {
        super.trimiteNotificare("Pe stadion are loc un meci de handbal");
    }

    @Override
    public void notificaMeciVolei() {
        super.trimiteNotificare("Pe stadion are loc un meci de volei");
    }

    public void notificaConcert() {
        super.trimiteNotificare("Pe stadion se v-a tine un concert");
    }
}
