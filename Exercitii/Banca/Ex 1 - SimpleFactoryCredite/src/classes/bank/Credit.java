package classes.bank;

public abstract class Credit {
    private String numeDetinator;
    private int suma;

    public Credit(String numeDetinator, int suma) {
        this.numeDetinator = numeDetinator;
        this.suma = suma;
    }

    public String getNumeDetinator() {
        return numeDetinator;
    }

    public void setNumeDetinator(String numeDetinator) {
        this.numeDetinator = numeDetinator;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "numeDetinator='" + numeDetinator + '\'' +
                ", suma=" + suma +
                '}';
    }
    public abstract void afiseazaDetalii();
}
