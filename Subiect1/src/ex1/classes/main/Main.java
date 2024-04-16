package ex1.classes.main;

import ex1.classes.Bicicleta;

public class Main {
    public static void main(String[] args) {

        Bicicleta.BuilderBicileta builder = new Bicicleta.BuilderBicileta();
        Bicicleta bicicleta1 = builder
                .setCascaProtectie(true)
                .setDiametruRoti(15)
                .setOchelari(true)
                .setTipFrana("pe spate")
                .build();

        Bicicleta bicicleta2 = builder
                .setCascaProtectie(false)
                .setDiametruRoti(10)
                .setOchelari(true)
                .setTipFrana("in fata")
                .build();

        Bicicleta bicicleta3 = builder
                .setCascaProtectie(true)
                .setDiametruRoti(15)
                .setOchelari(false)
                .setTipFrana("in fata")
                .build();

        Bicicleta bicicleta4 = builder
                .setCascaProtectie(false)
                .setDiametruRoti(20)
                .setOchelari(false)
                .setTipFrana("in fata")
                .build();
        System.out.println(bicicleta1);
        System.out.println(bicicleta2);
        System.out.println(bicicleta3);
        System.out.println(bicicleta4);

    }
}