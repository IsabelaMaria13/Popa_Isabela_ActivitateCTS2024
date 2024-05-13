package subject;

import observer.Observer;

public abstract class Subject {
    public abstract void adaugaAbonat(Observer a);

    public abstract void stergeAbonat(Observer a);

    public abstract void trimiteNotificare();
}
