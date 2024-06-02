package tests;

import classes.IPersoana;
import classes.PachetTuristic;
import classes.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.dubluri.PersoanaFake;
import tests.categorii.Mock;
import tests.categorii.WithoutMock;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(WithoutMock.class)
    public void testeazaCorectitudineaAplicaDiscount() {
        IPersoana client = new Persoana("Ioan Ioan", "1240414510087");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Andora", 22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);

        assertEquals(18.0, pachetTuristic.getPret(), 0.01);

    }

    @Test
    @Category(WithoutMock.class)
    public void aplicaDiscountBoundary() {
        IPersoana client = new Persoana("Dan Dan", "1590414510087");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(30.15, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(Mock.class)
    public void valoareAplicaDiscountFake() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(30.15, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(Mock.class)
    public void valoareNuAplicaDiscountFake() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        client.setValoareGetVarsta(30);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(33.5, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(Mock.class)
    public void valoareAplicaDiscount100() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);

        assertEquals(0.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(Mock.class)
    public void valoareAplicaDiscount0() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(0);

        assertEquals(33.5, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(Mock.class)
    public void valoareAplicaDiscount1() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bari", 33.5);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(1);

        assertEquals(33.165, pachetTuristic.getPret(), 0.01);
    }
}