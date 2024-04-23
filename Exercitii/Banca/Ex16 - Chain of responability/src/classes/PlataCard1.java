package classes;

public class PlataCard1 extends Plata {
    private double soldCard;

    public PlataCard1(double soldCard) {
        this.soldCard = soldCard;
    }

    @Override
    public void plateste(ClientBanca clientBanca, double suma) {
        if (soldCard > suma) {
            System.out.println("Plata efectuata cu card 1.");
            soldCard -= suma;
        } else {
            double aux = suma - soldCard;
            soldCard -= suma;
            System.out.println("S-a extras din cardul 1 suma de: " + aux);
            super.getUrmatorulCard().plateste(clientBanca, aux);
        }
    }

}
