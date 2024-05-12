package main;

import classes.INotaDePlata;
import classes.NotaDePlata;
import decorator.Decorator;
import decorator.NotaPlataDecorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlata("12.05.2024", 300);
        Decorator decorator = new NotaPlataDecorator(nota);
        decorator.printeazaNota();
        nota.printeazaNota();

    }
}