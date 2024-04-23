package classes;

public class PlataCard2 extends Plata {
    private double soldCard;

    public PlataCard2(double soldCard) {
        this.soldCard = soldCard;
    }

    @Override
    public void plateste(ClientBanca clientBanca, double suma) {
        if (soldCard > suma) {
            System.out.println("Plata efectuata cu card 2.");
            soldCard -= suma;
        } else {
            double aux = suma - soldCard;
            soldCard -= suma;
            System.out.println("S-a extras din cardul 2 suma de: " + aux);
            super.getUrmatorulCard().plateste(clientBanca, aux);
        }

    }
}
