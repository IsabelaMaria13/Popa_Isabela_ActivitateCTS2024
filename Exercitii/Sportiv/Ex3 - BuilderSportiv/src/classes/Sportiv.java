package classes;

public class Sportiv {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbietalaPersonalizata;
    private boolean genMuzical;

    public Sportiv(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa, boolean muzicaAmbietalaPersonalizata, boolean genMuzical) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        this.muzicaAmbietalaPersonalizata = muzicaAmbietalaPersonalizata;
        this.genMuzical = genMuzical;
    }

    public Sportiv() {
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public boolean isBauturaRacoritoareInclusa() {
        return bauturaRacoritoareInclusa;
    }

    public boolean isMuzicaAmbietalaPersonalizata() {
        return muzicaAmbietalaPersonalizata;
    }

    public boolean isGenMuzical() {
        return genMuzical;
    }

    void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    void setMuzicaAmbietalaPersonalizata(boolean muzicaAmbietalaPersonalizata) {
        this.muzicaAmbietalaPersonalizata = muzicaAmbietalaPersonalizata;
    }

    void setGenMuzical(boolean genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Sportiv{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoareInclusa=" + bauturaRacoritoareInclusa +
                ", muzicaAmbietalaPersonalizata=" + muzicaAmbietalaPersonalizata +
                ", genMuzical=" + genMuzical +
                '}';
    }
}
