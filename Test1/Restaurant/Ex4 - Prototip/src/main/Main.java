package main;

import classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion", "07431446612");
        Client clientExistent = client1.clone();
        System.out.println(client1);
        System.out.println(clientExistent);

    }
}