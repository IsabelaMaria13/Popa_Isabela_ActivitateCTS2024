package main;

import classes.IRealizarePlata;
import classes.RealizarePlata;
import decorator.RealizarePlataContactless;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRealizarePlata plata = new RealizarePlata(200, "Anton");
        plata.realizeazaPlata();

        IRealizarePlata plataContactless = new RealizarePlataContactless(plata);
        plataContactless.realizeazaPlata();


    }
}