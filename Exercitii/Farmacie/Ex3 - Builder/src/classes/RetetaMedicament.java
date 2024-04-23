package classes;

public class RetetaMedicament {
    private boolean numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private boolean cotaTVA;

    public RetetaMedicament(boolean numarPungi, boolean plataCuCard, boolean cardFidelitate, boolean cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public boolean isNumarPungi() {
        return numarPungi;
    }

    public boolean isPlataCuCard() {
        return plataCuCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public boolean isCotaTVA() {
        return cotaTVA;
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "numarPungi=" + numarPungi +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
    public static class Reteta implements RetetaBuilder{
        private boolean numarPungi;
        private boolean plataCuCard;
        private boolean cardFidelitate;
        private boolean cotaTVA;

        public Reteta() {
        }
        public Reteta setNumarPungi(boolean numarPungi) {
            this.numarPungi = numarPungi;
            return this;
        }

        public Reteta setPlataCuCard(boolean plataCuCard) {
            this.plataCuCard = plataCuCard;
            return this;
        }

        public Reteta setCardFidelitate(boolean cardFidelitate) {
            this.cardFidelitate = cardFidelitate;
            return this;
        }

        public Reteta setCotaTVA(boolean cotaTVA) {
            this.cotaTVA = cotaTVA;
            return this;
        }

        @Override
        public RetetaMedicament build() {
            return new RetetaMedicament(numarPungi,
                    plataCuCard, cardFidelitate, cotaTVA);
        }
    }

}
