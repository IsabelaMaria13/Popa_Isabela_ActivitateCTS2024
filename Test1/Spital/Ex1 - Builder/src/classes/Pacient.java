package classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halat = halat;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public boolean isHalat() {
        return halat;
    }

    void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halat=" + halat +
                '}';
    }

}
