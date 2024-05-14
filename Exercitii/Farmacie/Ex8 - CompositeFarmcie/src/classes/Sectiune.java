package classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraAbstracta {
    List<StructuraAbstracta> subSectiuni;

    public Sectiune(String nume) {
        super(nume);
        this.subSectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        subSectiuni.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        subSectiuni.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        return this.subSectiuni.get(index);
    }

    @Override
    public void afiseaza(String identare) {
        System.out.println(identare + super.getNume());
        for (int i = 0; i < subSectiuni.size(); i++) {
            this.subSectiuni.get(i).afiseaza(identare + " ");
        }
    }
}
