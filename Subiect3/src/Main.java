import classes.Pantof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Pantof.BuilderPantof<Pantof> builderPantof = new Pantof.BuilderPantof<>(38, 0.5, "piele");
        Pantof pantof = builderPantof.setMaterialeSecundare("paiete").build();
        System.out.println(pantof);

    }
}