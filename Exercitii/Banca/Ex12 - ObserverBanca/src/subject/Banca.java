package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Banca extends Subject {
    List<Observer> abonati = new ArrayList<>();

    @Override
    public void adaugaAbonat(Observer a) {
        abonati.add(a);
    }

    @Override
    public void stergeAbonat(Observer a) {
        abonati.remove(a);
    }

    @Override
    public void trimiteNotificare() {
        for (int i = 0; i < abonati.size(); i++) {
            abonati.get(i).primesteNotificari();
        }
    }
}
