import classes.Client;
import classes.Vanzare;
import classes.VanzareMedicament;
import classes.VanzareProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client Ioan = new Client("Ioan", true);
        Client Ion = new Client("Ion", false);

        Vanzare vanzare = new VanzareMedicament();

        Vanzare proxy = new VanzareProxy(vanzare);
        proxy.vanzareMedicament(Ioan);
        proxy.vanzareMedicament(Ion);
    }
}