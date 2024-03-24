package classes;

public class Autobuz implements PrototipAutobuz{
    int numarRotiRezerva;
    int kilometraj;
    int greutate;

    public Autobuz(int numarRotiRezerva, int kilometraj, int greutate) {
        this.numarRotiRezerva = numarRotiRezerva;
        this.kilometraj = kilometraj;
        this.greutate = greutate;
    }

    public Autobuz() {
    }

    public int getNumarRotiRezerva() {
        return numarRotiRezerva;
    }

    public void setNumarRotiRezerva(int numarRotiRezerva) {
        this.numarRotiRezerva = numarRotiRezerva;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public void setKilometraj(int kilometraj) {
        this.kilometraj = kilometraj;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numarRotiRezerva=" + numarRotiRezerva +
                ", kilometraj=" + kilometraj +
                ", greutate=" + greutate +
                '}';
    }

    @Override
    public Autobuz clone() {
        Autobuz autobuz = new Autobuz();
        autobuz.setGreutate(this.getGreutate());
        autobuz.setKilometraj(this.getKilometraj());
        autobuz.setNumarRotiRezerva(this.getNumarRotiRezerva());
        return autobuz;
    }
}
