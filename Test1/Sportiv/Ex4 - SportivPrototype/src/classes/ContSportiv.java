package classes;

import java.util.HashMap;
import java.util.Map;

public class ContSportiv extends ContSportivPrototip{
    private String nume;
    private int numar;
    private Map<String, Integer> sportiv = new HashMap<>();

    public ContSportiv(String nume, int numar, Map<String, Integer> sportiv) {
        this.nume = nume;
        this.numar = numar;
        this.sportiv = sportiv;
    }

    public ContSportiv() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public Map<String, Integer> getSportiv() {
        return sportiv;
    }

    public void setSportiv(Map<String, Integer> sportiv) {
        for (String s: sportiv.keySet()){
            this.sportiv.put(s, sportiv.get(s));
        }
    }

    @Override
    public String toString() {
        return "ContSportiv{" +
                "nume='" + nume + '\'' +
                ", numar=" + numar +
                ", sportiv=" + sportiv +
                '}';
    }

    @Override
    public ContSportiv clone() {
        ContSportiv contSportivNou = new ContSportiv();
        contSportivNou.setNumar(this.getNumar());
        contSportivNou.setSportiv(this.getSportiv());
        contSportivNou.setNume(this.getNume());
        return contSportivNou;
    }
}
