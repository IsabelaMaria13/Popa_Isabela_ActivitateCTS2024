package classes;

public class PlataCard3 extends Plata{
    private double soldCard;

    public PlataCard3(double soldCard) {
        this.soldCard = soldCard;
    }

    @Override
    public void plateste(ClientBanca clientBanca, double suma) {
        if (soldCard > suma) {
            System.out.println("Plata efectuata cu card 2.");
            soldCard -= suma;
        } else {
            System.out.println("Fonduri insuficiente pe toate cele 3 carduri pentru efectuarea acestei plati.");
        }
    }
}
