package ex1.classes;

public class Bicicleta {
    private final int diametruRoti;
    private final String tipFrana;
    private final boolean cascaProtectie;
    private final boolean ochelari;

    public Bicicleta(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari) {
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    public Bicicleta() {
        this.diametruRoti = 0;
        this.tipFrana = "N/A";
        this.cascaProtectie = false;
        this.ochelari = false;
    }

    public int isDiametruRoti() {
        return diametruRoti;
    }

    public String isTipFrana() {
        return tipFrana;
    }

    public boolean isCascaProtectie() {
        return cascaProtectie;
    }

    public boolean isOchelari() {
        return ochelari;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "diametruRoti=" + diametruRoti +
                ", tipFrana='" + tipFrana + '\'' +
                ", cascaProtectie=" + cascaProtectie +
                ", ochelari=" + ochelari +
                '}';
    }

    public static class BuilderBicileta<T> implements IBicicleta{
        private int diametruRoti;
        private String tipFrana;
        private boolean cascaProtectie;
        private boolean ochelari;

        public BuilderBicileta(int diametruRoti, String tipFrana, boolean cascaProtectie, boolean ochelari) {
            this.diametruRoti = diametruRoti;
            this.tipFrana = tipFrana;
            this.cascaProtectie = cascaProtectie;
            this.ochelari = ochelari;
        }

        public BuilderBicileta() {
        }

        public int getDiametruRoti() {
            return diametruRoti;
        }

        public String getTipFrana() {
            return tipFrana;
        }

        public boolean isCascaProtectie() {
            return cascaProtectie;
        }

        public boolean isOchelari() {
            return ochelari;
        }

        public BuilderBicileta setDiametruRoti(int diametruRoti) {
            this.diametruRoti = diametruRoti;
            return this;
        }

        public BuilderBicileta setTipFrana(String tipFrana) {
            this.tipFrana = tipFrana;
            return this;
        }

        public BuilderBicileta setCascaProtectie(boolean cascaProtectie) {
            this.cascaProtectie = cascaProtectie;
            return this;
        }

        public BuilderBicileta setOchelari(boolean ochelari) {
            this.ochelari = ochelari;
            return this;
        }

        @Override
        public Bicicleta build() {
            return new Bicicleta(this.diametruRoti, this.tipFrana, this.cascaProtectie, this.ochelari);
        }


    }
}
