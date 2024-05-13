package classes;

public class RealizarePlata implements IRealizarePlata {
    private double suma;
    private String client;

    public RealizarePlata(double suma, String client) {
        this.suma = suma;
        this.client = client;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public void realizeazaPlata() {
        System.out.println("Plata online sau la terminal cu cardul bancar standard pentru suma de " + this.suma);
    }
}
