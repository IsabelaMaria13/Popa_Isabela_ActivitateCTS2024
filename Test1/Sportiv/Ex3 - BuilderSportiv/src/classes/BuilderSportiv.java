package classes;

public class BuilderSportiv implements Builder {
    Sportiv sportiv = new Sportiv();
    public BuilderSportiv setMancareInclusa(boolean mancareInclusa) {
        sportiv.setMancareInclusa(mancareInclusa);
        return this;
    }

    public BuilderSportiv setScaunErgonomic(boolean scaunErgonomic) {
        sportiv.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public BuilderSportiv setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        sportiv.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
        return this;
    }

    public BuilderSportiv setMuzicaAmbietalaPersonalizata(boolean muzicaAmbietalaPersonalizata) {
        sportiv.setMuzicaAmbietalaPersonalizata(muzicaAmbietalaPersonalizata);
        return this;
    }

    public BuilderSportiv setGenMuzical(boolean genMuzical) {
        sportiv.setGenMuzical(genMuzical);
        return this;
    }
    @Override
    public Sportiv build() {
        return sportiv;
    }
}
