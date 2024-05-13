package classes;

public class Credit {
    private String client;
    private int suma;
    private String valuta;

    public Credit(String client, int suma, String valuta) {
        this.client = client;
        this.suma = suma;
        this.valuta = valuta;
    }

    public String getClient() {
        return client;
    }

    public int getSuma() {
        return suma;
    }

    public String getValuta() {
        return valuta;
    }
}
