package main;


import classes.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(3, 300);
        bancomat.seVerificaCardul();
        bancomat.seRealizeazaRetragerea();
        Bancomat bancomat1 = new Bancomat(2, 0 );
        bancomat1.seVerificaCardul();
        bancomat1.seRealizeazaRetragerea();

    }
}