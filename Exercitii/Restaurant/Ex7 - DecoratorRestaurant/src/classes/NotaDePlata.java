package classes;

public class NotaDePlata implements INotaDePlata {
    private String data;
    private double suma;

    public NotaDePlata(String data, double suma) {
        this.data = data;
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("In data de " + this.data
                + " nota de plata este in valoare de " + this.suma);
    }
}
