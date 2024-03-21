package classes;

public class Card {
    private boolean primesteSalariul;
    private boolean areCardAtasat;
    private boolean internetBanking;

    public Card(boolean primesteSalariul, boolean areCardAtasat, boolean internetBanking) {
        this.primesteSalariul = primesteSalariul;
        this.areCardAtasat = areCardAtasat;
        this.internetBanking = internetBanking;
    }

    public boolean isPrimesteSalariul() {
        return primesteSalariul;
    }

    public boolean isAreCardAtasat() {
        return areCardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    @Override
    public String toString() {
        return "Card{" +
                "primesteSalariul=" + primesteSalariul +
                ", areCardAtasat=" + areCardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }

    public static class Builder implements CardBuilder {
        private boolean primesteSalariul;
        private boolean areCardAtasat;
        private boolean internetBanking;

        public Builder(boolean primesteSalariul, boolean areCardAtasat, boolean internetBanking) {
            this.primesteSalariul = primesteSalariul;
            this.areCardAtasat = areCardAtasat;
            this.internetBanking = internetBanking;
        }

        public Builder() {
        }

        public Builder setPrimesteSalariul(boolean primesteSalariul) {
            this.primesteSalariul = primesteSalariul;
            return this;
        }

        public Builder setAreCardAtasat(boolean areCardAtasat) {
            this.areCardAtasat = areCardAtasat;
            return this;
        }

        public Builder setInternetBanking(boolean internetBanking) {
            this.internetBanking = internetBanking;
            return this;
        }
        @Override
        public Card build(){
            return new Card(primesteSalariul, areCardAtasat, internetBanking);
        }

    }
}
