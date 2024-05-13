package classes;

import java.util.HashMap;

public class Banca {
    private HashMap<Integer, IFlyweight> conturi;

    public Banca() {
        this.conturi = new HashMap<>();
    }

    public IFlyweight creareCont(int nrCont, IFlyweight nume) {
        IFlyweight flyweight = conturi.get(nume);
        if (flyweight == null) {
            flyweight = new Client("Ana", "ceva", "009876543", "ana");
            conturi.put(nrCont, flyweight);
        }
        return flyweight;
    }
}
