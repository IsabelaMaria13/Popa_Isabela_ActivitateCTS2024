package subject;

import observer.Observer;

public abstract class Subject {
    public abstract void adaugaAbonat(Observer observer);
    public abstract void stergeAbonat(Observer observer);
    public abstract void trimiteNotificare(String mesaj);

}
