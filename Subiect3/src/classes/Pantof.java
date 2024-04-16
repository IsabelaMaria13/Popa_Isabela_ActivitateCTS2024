package classes;

import factory.TipPantof;

public class Pantof {
    private int numarPantof;
    private double dimensiuneToc;
    private String materialDeBaza;
    private String materialSecundar;
    private String listaMesaje;

    public Pantof(int numarPantof, double dimensiuneToc, String materialDeBaza) {
        this.numarPantof = numarPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.materialDeBaza = materialDeBaza;
        this.materialSecundar = "N/A";
        this.listaMesaje = "N/A";
    }

    public Pantof() {
        this.numarPantof = 0;
        this.dimensiuneToc = 0.0;
        this.materialDeBaza = "N/A";
        this.materialSecundar= "N/A";
        this.listaMesaje= "N/A";
    }

    public int getNumarPantof() {
        return numarPantof;
    }

    public double getDimensiuneToc() {
        return dimensiuneToc;
    }

    public String getMaterialDeBaza() {
        return materialDeBaza;
    }

    public String getMaterialSecundar() {
        return materialSecundar;
    }

    public String getListaMesaje() {
        return listaMesaje;
    }

    void setNumarPantof(int numarPantof) {
        this.numarPantof = numarPantof;
    }

    void setDimensiuneToc(double dimensiuneToc) {
        this.dimensiuneToc = dimensiuneToc;
    }

    void setMaterialDeBaza(String materialDeBaza) {
        this.materialDeBaza = materialDeBaza;
    }

    void setMaterialSecundar(String materialSecundar) {
        this.materialSecundar = materialSecundar;
    }

    void setListaMesaje(String listaMesaje) {
        this.listaMesaje = listaMesaje;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "numarPantof=" + numarPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialDeBaza='" + materialDeBaza + '\'' +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", listaMesaje='" + listaMesaje + '\'' +
                '}';
    }

    public static class BuilderPantof<T> implements Builder{
        private int numarPantof;
        private double dimensiuneToc;
        private String materialDeBaza;
        private String materialSecundar;
        private String listaMesaje;

        public BuilderPantof(int numarPantof, double dimensiuneToc, String materialDeBaza) {
            this.numarPantof = numarPantof;
            this.dimensiuneToc = dimensiuneToc;
            this.materialDeBaza = materialDeBaza;
            this.materialSecundar = "N/A";
            this.listaMesaje = "N/A";
        }
        public BuilderPantof() {
            this.numarPantof = 0;
            this.dimensiuneToc = 0.0;
            this.materialDeBaza = "N/A";
            this.materialSecundar = "N/A";
            this.listaMesaje = "N/A";
        }
        public BuilderPantof setMaterialeSecundare(String materialeSecundare) {
            this.materialSecundar = materialeSecundare;
            return this;
        }

        public BuilderPantof setListaMesaje(String listaMesaje) {
            this.listaMesaje = listaMesaje;
            return this;
        }

        @Override
        public Pantof build() {
            Pantof pantof =  new Pantof(numarPantof, dimensiuneToc, materialDeBaza);
            pantof.setMaterialSecundar(materialSecundar);
            pantof.setListaMesaje(listaMesaje);
            return pantof;
        }
    }
}
