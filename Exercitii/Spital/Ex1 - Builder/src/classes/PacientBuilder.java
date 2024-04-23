package classes;

public class PacientBuilder implements AbstractBuilder {
    Pacient pacient;

    public PacientBuilder() {
        pacient = new Pacient(false, false, false, false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun) {
        this.pacient.setMicDejun(micDejun);
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public PacientBuilder setHalat(boolean halat) {
        this.pacient.setHalat(halat);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
