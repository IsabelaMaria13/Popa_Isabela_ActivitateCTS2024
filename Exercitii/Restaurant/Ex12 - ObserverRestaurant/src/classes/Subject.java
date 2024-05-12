package classes;

import client.Client;
import client.Observer;

public interface Subject {
    public void adaugaObserver(Observer observer);

    public void stergeObserver(Observer observer);

    public void trimiteNotificari(String mesaj);
}
