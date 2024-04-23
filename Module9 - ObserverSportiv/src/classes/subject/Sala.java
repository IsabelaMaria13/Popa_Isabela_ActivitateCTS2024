package classes.subject;

public class Sala extends Subject {
    @Override
    public void notificaMeciFotbal() {
        this.trimiteNotificare("La sala v-a avea loc un meci de fotbal");
    }

    @Override
    public void notificaMeciHandbal() {
        this.trimiteNotificare("La sala v-a avea loc un meci de handbal");
    }

    @Override
    public void notificaMeciVolei() {
        this.trimiteNotificare("La sala v-a avea loc un meci de volei");
    }
}
